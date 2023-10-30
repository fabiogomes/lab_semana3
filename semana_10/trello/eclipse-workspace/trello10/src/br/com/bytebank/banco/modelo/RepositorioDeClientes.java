package br.com.bytebank.banco.modelo;

public class RepositorioDeClientes {
    private Cliente[] lista = new Cliente[10];
    private int posicao = 0;

    public void AddCliente(Cliente cliente){
        this.lista[posicao] = cliente;
        this.posicao++;
    }

    public void ListaClientes(){
        for(int i = 0; i < 10; i++){
            if(this.lista[i] != null) {
                String exibe = this.lista[i].getNome();
                System.out.println("Cliente Posicao: " + i + ": " + exibe);
            }
        }
    }

    public void BuscaCliente(int posicao){
        System.out.println("Cliente posicao " + posicao + ": " + lista[posicao - 1].getNome());
    }

    public void ListaQuantidade(){
        int quantidade = 0;
        for(int i = 0; i < 10; i++){
            if(this.lista[i] != null) {
                quantidade++;
            }
        }
        System.out.println("Quantidade de Clientes: " + quantidade);
    }

}
