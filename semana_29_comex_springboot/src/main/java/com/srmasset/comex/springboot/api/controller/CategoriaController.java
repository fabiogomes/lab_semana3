package com.srmasset.comex.springboot.api.controller;

import com.srmasset.comex.springboot.api.core.orm.Categoria;
import com.srmasset.comex.springboot.api.core.orm.DadosCadastroCategoria;
import com.srmasset.comex.springboot.api.core.repository.CategoriaRepository;
import com.srmasset.comex.springboot.api.core.orm.DadosListagemCategorias;
import com.srmasset.comex.springboot.api.core.service.CrudCategoriaService;
import com.srmasset.comex.springboot.api.core.service.RelatoriosService;
import com.srmasset.comex.springboot.api.core.vo.RelatorioDeVendasPorCategoria;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.transaction.TransactionScoped;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaRepository repository;

    @PostMapping()
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCategoria dados){
        repository.save(new Categoria(dados));
    }

    @GetMapping("/lista")
    public Page<DadosListagemCategorias> listarTodos(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemCategorias::new);
    }

    @GetMapping("/{id}")
    public DadosListagemCategorias listarPorId(@PathVariable Long id){
        Optional<Categoria> bancoCat = repository.findById(id);
        Categoria categoria = bancoCat.orElse(new Categoria());
        return new DadosListagemCategorias(categoria);
    }

    @GetMapping("/vendas")
    public List<RelatorioDeVendasPorCategoria> listarRelatorioDeVendasPorCategoria(){
        RelatoriosService service = new RelatoriosService(repository);
        return service.relatorioDeVendasPorCategoria();
    }

    @PatchMapping("/{id}")
    @Transactional
    public void ativarDesativarCategorias(@PathVariable Long id){
        CrudCategoriaService service = new CrudCategoriaService(repository);
        service.ativaDesaticaCategoria(id);
    }
}
