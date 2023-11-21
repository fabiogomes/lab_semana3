package com.srmasset.comex.springboot.api.core.service;

import com.srmasset.comex.springboot.api.core.orm.Categoria;
import com.srmasset.comex.springboot.api.core.orm.Cliente;
import com.srmasset.comex.springboot.api.core.orm.Produto;
import com.srmasset.comex.springboot.api.core.repository.CategoriaRepository;
import com.srmasset.comex.springboot.api.core.repository.ClienteRepository;
import com.srmasset.comex.springboot.api.core.repository.ProdutoRepository;
import com.srmasset.comex.springboot.api.core.vo.RelatorioClienteFieis;
import com.srmasset.comex.springboot.api.core.vo.RelatorioDeVendasPorCategoria;
import com.srmasset.comex.springboot.api.core.vo.RelatorioMaisVendidos;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class RelatoriosService {
    private final CategoriaRepository categoriaRepository;

    public RelatoriosService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    private void buscarCategoriaPorNome(Scanner scan){
        System.out.println("Qual nome deseja buscar? ");
        String nome = scan.next();
        List<Categoria> categorias = categoriaRepository.findByNome(nome);
        categorias.forEach(c -> {
            System.out.println("Nome da categoria: " + c.getNome());
            System.out.println("Status da categoria: " + c.getAtivo());
            System.out.println();
        });
    }

    public List<RelatorioDeVendasPorCategoria> relatorioDeVendasPorCategoria(){
        return categoriaRepository.relatorioDeVendasPorCategoria();
    }
}
