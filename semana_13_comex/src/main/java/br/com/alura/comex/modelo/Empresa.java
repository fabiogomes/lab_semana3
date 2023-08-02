package br.com.alura.comex.modelo;

public class Empresa {
    private Funcionario[] funcionarios = new Funcionario[5];
    private int posicao;

    public void adicionar(Funcionario funcionario) {
        this.funcionarios[posicao++] = funcionario;
    }

    public int getQuantidadeDeFuncionarioAtivos() {
        int quantidade = 0;
        for(int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] != null) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public Funcionario getFuncionario(int posicao) {
        return funcionarios[posicao];
    }
}
