package br.com.bytebank.banco.modelo;

public class RepositorioDeObjetos {
    private Object[] lista = new Object[2];
    private int posicao = 0;

    public void AddObjeto(Object obj){
        this.lista[posicao] = obj;
        this.posicao++;
    }

    public void ListaObjetos(){
        for(int i = 0; i < 2; i++){
            if(this.lista[i] != null) {
                String exibe = this.lista[i].toString();
                System.out.println("Objeto Posicao: " + i + ": " + exibe);
            }
        }
    }

    public void BuscaObjeto(int posicao){
        System.out.println("Cliente posicao " + posicao + ": " + lista[posicao - 1].toString());
    }

    public void ListaQuantidade(){
        int quantidade = 0;
        for(int i = 0; i < 2; i++){
            if(this.lista[i] != null) {
                quantidade++;
            }
        }
        System.out.println("Quantidade de Objetos: " + quantidade);
    }

}
