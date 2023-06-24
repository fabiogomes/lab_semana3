package br.com.alura.Modelo;

public class RepositorioDeClientes {
    private Cliente[] clientes = new Cliente[10];
    private int posicao;

    public void adicionar(Cliente cliente) {
        this.clientes[posicao++] = cliente;
    }

    public Cliente[] buscaTodos() {
        return this.clientes;
    }

    public Cliente buscaPorPosicao(int posicao) {
        return this.clientes[posicao];
    }

    public int getQuantidadeDeClientesArmazenados() {
        int quantidade = 0;

        for(int i = 0; i < this.clientes.length; i++) {
            if(this.clientes[i] != null) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public void mostra() {
        for(int i = 0; i < this.clientes.length; i++) {
            if(this.clientes[i] != null) {
                System.out.println("Nome: " + this.clientes[i].getNome());
            }
        }
    }
}
