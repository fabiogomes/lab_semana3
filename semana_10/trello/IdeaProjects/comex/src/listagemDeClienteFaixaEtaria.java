public class listagemDeClienteFaixaEtaria {
    public static void main(String[] args) {
        int idadeFulano = 1980;
        int idadeSicrano = 2000;
        String nomeFulano = "Fulano";
        String nomeSicrano = "Sicrano";
        String cEtaria = "";
        System.out.println(">>> Listagem de clientes");
        System.out.println(">>> Ano Atual: 2023");

        System.out.println(">>> _________________________________");
        System.out.println("Nome: " + nomeFulano);
        System.out.println("Data de nascimento:" + idadeFulano);
        System.out.println("Idade:" + (2023 - idadeFulano));
        if((2023 - idadeFulano) <= 17){
            cEtaria = "ADOLESCENTE";
        }else if((2023 - idadeFulano)<=29){
            cEtaria = "JOVEM";
        }else if((2023 - idadeFulano)<=59){
            cEtaria = "ADULTO";
        }else if((2023 - idadeFulano)>=60){
            cEtaria = "IDOSO";
        }
        System.out.println("Caracteristica Etaria:" + cEtaria);
        System.out.println();

        System.out.println(">>> _________________________________");
        System.out.println("Nome: " + nomeSicrano);
        System.out.println("Data de nascimento:" + idadeSicrano);
        System.out.println("Idade:" + (2023 - idadeSicrano));
        if((2023 - idadeSicrano) <= 17){
            cEtaria = "ADOLESCENTE";
        }else if((2023 - idadeSicrano)<=29){
            cEtaria = "JOVEM";
        }else if((2023 - idadeSicrano)<=59){
            cEtaria = "ADULTO";
        }else if((2023 - idadeSicrano)>=60){
            cEtaria = "IDOSO";
        }
        System.out.println("Caracteristica Etaria:" + cEtaria);
        System.out.println();
    }
}
