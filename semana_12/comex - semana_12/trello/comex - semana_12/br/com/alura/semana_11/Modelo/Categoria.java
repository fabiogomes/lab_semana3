package br.com.alura.semana_11.Modelo;

public class Categoria {
    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode(){
        return this.nome.hashCode();
    }

    @Override
    public boolean equals(Object categoria) {
        Categoria outraCategoria = (Categoria) categoria;
        return this.nome.equals(outraCategoria.getNome());
        //return this.nome.charAt(0);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
