package com.srmasset.comex.springdata.service;

import com.srmasset.comex.springdata.orm.Categoria;
import com.srmasset.comex.springdata.orm.Produto;
import com.srmasset.comex.springdata.repository.CategoriaRepository;
import com.srmasset.comex.springdata.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Scanner;

@Service
public class CrudProdutoService {
    private final ProdutoRepository produtoRepository;
    private final CategoriaRepository categoriaRepository;

    public CrudProdutoService(ProdutoRepository produtoRepository, CategoriaRepository categoriaRepository){
        this.produtoRepository = produtoRepository;
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
        System.out.println("Digite o nome do produto");
        String nome = scan.next();

        System.out.println("Digite o preco");
        BigDecimal preco = scan.nextBigDecimal();

        System.out.println("Digite a descricao");
        String descricao = scan.next();

        System.out.println("Digite a quantidade em estoque");
        Integer qtdEstoque = scan.nextInt();

        System.out.println("Digite a id da categoria a que pertence");
        Long catId = scan.nextLong();
        Categoria categoria = new Categoria();

        Optional<Categoria> cat = categoriaRepository.findById(catId);
        cat.ifPresent(c ->{
            categoria.setId(c.getId());
            categoria.setNome(c.getNome());
            categoria.setStatus(c.getStatus());
        });

        Produto produto = new Produto(nome, preco, descricao, qtdEstoque, categoria);

        produtoRepository.save(produto);
        System.out.println("Produto salvo");
    }

    private void atualizar(Scanner scan){
        System.out.println("Digite a id do produto");
        Produto produto = new Produto();
        produto.setId(scan.nextLong());

        System.out.println("Digite o nome do produto");
        produto.setNome(scan.next());

        System.out.println("Digite o preco");
        produto.setPreco(scan.nextBigDecimal());

        System.out.println("Digite a descricao");
        produto.setDescricao(scan.next());

        System.out.println("Digite a quantidade em estoque");
        produto.setQuantidadeEstoque(scan.nextInt());

        System.out.println("Digite a id da categoria a que pertence");
        Long catId = scan.nextLong();
        Categoria categoria = new Categoria();
        Optional<Categoria> cat = categoriaRepository.findById(catId);
        cat.ifPresent(c ->{
            categoria.setId(c.getId());
            categoria.setNome(c.getNome());
            categoria.setStatus(c.getStatus());
        });
        produto.setCategoria(categoria);

        produtoRepository.save(produto);
        System.out.println("Produto atualizado");
    }

    private void deletar(Scanner scan){
        System.out.println("Digite a id do produto");
        produtoRepository.deleteById(scan.nextLong());
        System.out.println("Produto deletado");
    }

    private void listarTodos(){
        Iterable<Produto> produtos = produtoRepository.findAll();
        produtos.forEach(p -> {
            System.out.println("Id do produto: " + p.getId().toString());
            System.out.println("Nome do produto: " + p.getNome());
            System.out.println("Descrição: " + p.getDescricao());
            System.out.println("Preco: " + p.getPreco().toString());
            System.out.println("Quantidade em estoque: " + p.getQuantidadeEstoque().toString());
            System.out.println();

            //System.out.println(p.toString()); LazyInitializationException
            //System.out.printf(p.getCategoria().getNome()); LazyInitializationException
        });
    }
}
