public class TestaCondicional12 {
    public static void main(String[] args) {
//        System.out.println("testando condicionais");
//        int idade = 16;
//        int quantidadePessoas = 3;
//
//        if (idade >= 18) {
//            System.out.println("você tem mais de 18 anos");
//            System.out.println("seja bem vindo");
//        } else {
//            if(quantidadePessoas >= 2) {
//                System.out.println("você não tem 18, mas " + "pode entrar, pois está acompanhado");
//            } else {
//            System.out.println("infelizmente você não pode entrar");
//            }
//        }
        System.out.println("testando condicionais");
        int idade = 20;
                int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

                System.out.println("valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}