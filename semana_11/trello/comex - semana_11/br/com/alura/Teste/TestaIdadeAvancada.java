package br.com.alura.Teste;

public class TestaIdadeAvancada {
    public static void main(String[] args) {
        int[] idades;
        idades = new int[2];

//        System.out.println("Posição 0: " + idades[0]);
        idades[0] = 10;
//        System.out.println("Posição 0: " + idades[0]);
//        System.out.println("================================");
//        System.out.println("Posição 1: " + idades[1]);
        idades[1] = 20;
//        System.out.println("Posição 1: " + idades[1]);

        for(int i = 0; i < idades.length; i++) {
            System.out.println("Posição " + i + " : " + idades[i]);
        }

        System.out.println(idades[20]);
    }
}
