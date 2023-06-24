package br.com.alura.Teste;

import br.com.alura.Modelo.Funcionario;

public class TestaEmpresaComFuncionarios {
    public static void main(String[] args) {
        Funcionario[] funcionarios;
        funcionarios = new Funcionario[5];

        Funcionario fabio = new Funcionario();
        fabio.setMatricula(1);
        fabio.setNome("Fabio");

        funcionarios[0] = fabio;

        for(int i = 0; i < 5; i++) {
            if(funcionarios[i] != null)
                System.out.println(funcionarios[i].getNome());
        }
    }

    public static int getQuantidade(Funcionario[] funcionarios) {
        for(int i = 0; i < funcionarios.length; i++) {

        }
        return 0;
    }
}
