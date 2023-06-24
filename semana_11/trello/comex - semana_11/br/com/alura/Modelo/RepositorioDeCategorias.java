package br.com.alura.Modelo;

public class RepositorioDeCategorias {
    private Categoria[] categorias;
    private int posicao;

     public RepositorioDeCategorias() {
         this.categorias = new Categoria[5];
     }

    public void adicionar(Categoria categoria) {
        this.categorias[posicao++] = categoria;
    }

    public Categoria[] buscaTodos() {
        return this.categorias;
    }

    public Categoria buscaPorPosicao(int posicao) {
        return this.categorias[posicao];
    }

    public int getQuantidadeDeCategoriasArmazenados() {
        int quantidade = 0;

        for(int i = 0; i < this.categorias.length; i++) {
            if(this.categorias[i] != null) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public void mostra() {
        for(int i = 0; i < this.categorias.length; i++) {
            if(this.categorias[i] != null) {
                System.out.println("Nome: " + this.categorias[i].getNome());
            }
        }
    }
}
