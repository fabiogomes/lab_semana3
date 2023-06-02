public class TestaLancamento_checked extends Exception{
    public static void lancarFoguete(String direcao){
        if(direcao == "indo"){
            System.out.println("^^^Lancamento autorizado^^^");
            troposfera(direcao);
        } else{
            System.out.println("====^SAINDO DA CAMADA TROPOSFERA^=======");
        }
    }

    public static void pousarFoguete(){
        System.out.println("___Aterrisagem perfeita!!!___");
    }

    public static void troposfera(String direcao){
        if(direcao == "indo"){
            System.out.println("====^ENTRANDO NA CAMADA TROPOSFERA [15KM]^=======");
            estratosfera(direcao);
        } else{
            System.out.println("====^SAINDO DA CAMADA TROPOSFERA^=======");
            pousarFoguete();
        }
    }

    public static void estratosfera(String direcao) throws ArithmeticException{
        if(direcao == "indo"){
            try {
                System.out.println("====^ENTRANDO NA CAMADA ESTRATOSFERA [50KM]^=======");
                throw new ArithmeticException("ERRO DE CALCULOS");
            }catch(ArithmeticException ex){
                System.out.println("Ocorreu um erro: " + ex.getStackTrace());
            } finally {
                mesosfera("indo");
            }
        } else{
            System.out.println("====^SAINDO DA CAMADA ESTRATOSFERA^=======");
            troposfera("voltando");
        }
    }

    public static void mesosfera(String direcao){
        if(direcao == "indo"){
            System.out.println("====^ENTRANDO NA CAMADA MESOSFERA [80KM]^=======");
            termosfera(direcao);
        } else{
            System.out.println("====^SAINDO DA CAMADA MESOSFERA^=======");
            estratosfera("voltando");
        }
    }

    public static void termosfera(String direcao){
        if(direcao == "indo"){
            System.out.println("====^ENTRANDO NA CAMADA TERMOSFERA [250KM]^=======");
            exosfera();
        } else{
            System.out.println("====^SAINDO DA CAMADA TERMOSFERA^=======");
            mesosfera("voltando");
        }
    }

    public static void exosfera(){
        System.out.println("====^ENTRANDO NA CAMADA EXOSFERA [500KM]^=======");
        System.out.println("*********(SATELITE)******(TELESCOPIOS)*********");
        System.out.println("====^SAINDO DA CAMADA EXOSFERA^=======");
        termosfera("voltando");
    }

    public static void main(String[] args) {
        lancarFoguete("indo");
    }
}
