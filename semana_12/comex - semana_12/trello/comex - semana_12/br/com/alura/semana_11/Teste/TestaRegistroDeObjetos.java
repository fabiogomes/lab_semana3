package br.com.alura.semana_11.Teste;

import br.com.alura.semana_11.Modelo.Categoria;
import br.com.alura.semana_11.Modelo.Cliente;
import br.com.alura.semana_11.Modelo.RepositorioDeObjetos;

public class TestaRegistroDeObjetos {
    public static void main(String[] args) {
        RepositorioDeObjetos repositorio = new RepositorioDeObjetos();

        Cliente fabio = new Cliente("Fabio");

        Categoria celulares = new Categoria();
        celulares.setNome("Celulares");

        repositorio.adicionar(fabio);
        repositorio.adicionar(celulares);

        Object[] objects = repositorio.buscaTodos();

        for(int i = 0; i < objects.length; i++) {
            if(objects[i] instanceof Cliente) {
                Cliente cliente = (Cliente) objects[i];
                System.out.println(cliente.getNome());
            }

            if(objects[i] instanceof Categoria) {
                Categoria categoria = (Categoria) objects[i];
                System.out.println(categoria.getNome());
            }
        }
    }
}
