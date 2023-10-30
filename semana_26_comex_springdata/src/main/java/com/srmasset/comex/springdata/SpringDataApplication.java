package com.srmasset.comex.springdata;

import com.srmasset.comex.springdata.service.CrudCategoriaService;
import com.srmasset.comex.springdata.service.CrudClienteService;
import com.srmasset.comex.springdata.service.CrudProdutoService;
import com.srmasset.comex.springdata.service.RelatoriosService;
import com.srmasset.comex.springdata.service.PopulaBanco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
    @Autowired
    private final CrudCategoriaService categoriaService;
    @Autowired
    private final CrudClienteService clienteService;
    @Autowired
    private final CrudProdutoService produtoService;
    @Autowired
    private final RelatoriosService relatoriosService;
    @Autowired
    private final PopulaBanco populaBanco;
    private Boolean menuloop = Boolean.TRUE;

    @Autowired
    public SpringDataApplication (CrudCategoriaService categoriaService,
                                  CrudClienteService clienteService,
                                  CrudProdutoService produtoService,
                                  RelatoriosService relatoriosService,
                                  PopulaBanco populaBanco){
        this.categoriaService = categoriaService;
        this.clienteService = clienteService;
        this.produtoService = produtoService;
        this.relatoriosService = relatoriosService;
        this.populaBanco = populaBanco;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        populaBanco.popular();
        Scanner scan = new Scanner(System.in);
        while(menuloop){
            System.out.println("Qual opção deseja executar?");
            System.out.println("0 - Sair");
            System.out.println("1 - Categoria");
            System.out.println("2 - Produto");
            System.out.println("3 - Cliente");
            System.out.println("4 - Relatorios");

            Integer opcao = scan.nextInt();
            if(opcao == 1) {
                categoriaService.inicia(scan);
            }
            else if(opcao == 2){
                produtoService.inicia(scan);
            }
            else if(opcao == 3){
                clienteService.inicia(scan);
            }
            else if(opcao == 4){
                relatoriosService.inicia(scan);
            }
            else{
                menuloop = Boolean.FALSE;
            }
        }
    }
}

