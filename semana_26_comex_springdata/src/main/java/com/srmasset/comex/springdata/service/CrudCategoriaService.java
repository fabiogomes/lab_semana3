package com.srmasset.comex.springdata.service;

import com.srmasset.comex.springdata.orm.Categoria;
import com.srmasset.comex.springdata.repository.CategoriaRepository;
import org.hibernate.boot.archive.scan.spi.ScanEnvironment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class CrudCategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CrudCategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public void inicia(Scanner scan){
        System.out.println("O que desja fazer?");
        System.out.println("0 - Sair");
        System.out.println("1 - Salvar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Deletar");
        System.out.println("4 - Listar todos");

        int opcao = scan.nextInt();
        switch(opcao){
            case 1:
                salvar(scan);
                break;
            case 2:
                atualizar(scan);
                break;
            case 3:
                deletar(scan);
                break;
            case 4:
                listarTodos();
                break;
        }
    }

    private void salvar(Scanner scan){
        System.out.println("Digite o nome da categoria");
        String nome = scan.next();
        Categoria categoria = new Categoria(nome);

        categoriaRepository.save(categoria);
        System.out.println("Categoria salva");
    }

    private void atualizar(Scanner scan){
        Categoria categoria = new Categoria();
        System.out.println("Digite a id da categoria");
        categoria.setId(scan.nextLong());
        System.out.println("Digiteo nome da categoria");
        categoria.setNome(scan.next());
        System.out.println("Digite o status da categoria 1 = ativo, 0 = inativa");
        categoria.setStatus(Boolean.valueOf(scan.next()));

        categoriaRepository.save(categoria);
        System.out.println("Categoria atualizada");
    }

    private void deletar(Scanner scan){
        System.out.println("Digite a id da categoria");
        categoriaRepository.deleteById(scan.nextLong());
        System.out.println("Categoria deletada");
    }

    private void listarTodos(){
        Iterable<Categoria> categorias = categoriaRepository.findAll();
        categorias.forEach(c -> {
            //System.out.println(c.toString()); //System.out.println(p.toString()); LazyInitializationException

            System.out.println("Id da categoria: " + c.getId().toString());
            System.out.println("Nome da categoria: " + c.getNome());
            System.out.println("Status da categoria: " + c.getStatus().toString());
            System.out.println();
        });
    }
}
