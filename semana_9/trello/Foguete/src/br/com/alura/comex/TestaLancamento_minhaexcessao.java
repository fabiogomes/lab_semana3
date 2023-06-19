/**
 * Classe de teste para lancamento de excessoes personalizadas
 * utilizando a classe ExceptionFalhaMotor
 * @author David Edson da cruz
 * @see java.lang.error
 */

package br.com.alura.comex;

import br.com.alura.comex.modelo.ExceptionFalhaMotor;

class TestaLancamento_minhaexcessao {

    /**
     * As classes chamam umas as outras a partir de main chamando
     * lancarFoguete utilizando o parametro direção para ir e voltar
     * pelos mesmos métodos.
     * @param direcao
     */
    static void lancarFoguete(String direcao) {
        if (direcao == "indo") {
            System.out.println("^^^Lancamento autorizado^^^");
            troposfera(direcao);
        } else {
            System.out.println("====^SAINDO DA CAMADA TROPOSFERA^=======");
        }
    }

    static void pousarFoguete() {
        System.out.println("___Aterrisagem perfeita!!!___");
    }

    static void troposfera(String direcao) {
        if (direcao == "indo") {
            System.out.println("====^ENTRANDO NA CAMADA TROPOSFERA [15KM]^=======");
            estratosfera(direcao);
        } else {
            System.out.println("====^SAINDO DA CAMADA TROPOSFERA^=======");
            pousarFoguete();
        }
    }

    static void estratosfera(String direcao) throws ArithmeticException {
        if (direcao == "indo") {
            try {
                System.out.println("====^ENTRANDO NA CAMADA ESTRATOSFERA [50KM]^=======");
                throw new ExceptionFalhaMotor("Perca de Pressao");
            } catch (ExceptionFalhaMotor ex) {
                System.out.println("Erro recuperado: " + ex.getMessage());
            } finally {
                mesosfera("indo");
            }
        } else {
            System.out.println("====^SAINDO DA CAMADA ESTRATOSFERA^=======");
            troposfera("voltando");
        }
    }

    static void mesosfera(String direcao) {
        if (direcao == "indo") {
            System.out.println("====^ENTRANDO NA CAMADA MESOSFERA [80KM]^=======");
            termosfera(direcao);
        } else {
            System.out.println("====^SAINDO DA CAMADA MESOSFERA^=======");
            estratosfera("voltando");
        }
    }

    static void termosfera(String direcao) {
        if (direcao == "indo") {
            System.out.println("====^ENTRANDO NA CAMADA TERMOSFERA [250KM]^=======");
            exosfera();
        } else {
            System.out.println("====^SAINDO DA CAMADA TERMOSFERA^=======");
            mesosfera("voltando");
        }
    }

    static void exosfera() {
        System.out.println("====^ENTRANDO NA CAMADA EXOSFERA [500KM]^=======");
        System.out.println("*********(SATELITE)******(TELESCOPIOS)*********");
        System.out.println("====^SAINDO DA CAMADA EXOSFERA^=======");
        termosfera("voltando");
    }

    public static void main(String[] args) {
        lancarFoguete("indo");
    }
}