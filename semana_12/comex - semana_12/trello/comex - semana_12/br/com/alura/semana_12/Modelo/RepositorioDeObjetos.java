package br.com.alura.semana_12.Modelo;

public class RepositorioDeObjetos {
    private Object[] objetos = new Object[2];
    private int posicao;

    public void adicionar(Object object) {
        this.objetos[posicao++] = object;
    }

    public Object[] buscaTodos() {
        return this.objetos;
    }
}
