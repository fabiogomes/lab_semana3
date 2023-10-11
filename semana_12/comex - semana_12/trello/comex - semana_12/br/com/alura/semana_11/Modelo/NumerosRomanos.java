package br.com.alura.semana_11.Modelo;

import java.util.Map;
import java.util.TreeMap;

public class NumerosRomanos {
    private Map<String, Integer> mapa = new TreeMap<>();

    public NumerosRomanos(){
        mapa.put("I", 1);
        mapa.put("II", 2);
        mapa.put("III", 3);
        mapa.put("IV", 4);
        mapa.put("V", 5);
        mapa.put("VI", 6);
        mapa.put("VII", 7);
        mapa.put("VIII", 8);
        mapa.put("IX", 9);
        mapa.put("X", 10);
    }

    public Integer buscaChave (String chave){
       return this.mapa.get(chave);
    }

    public void mostraChaves(){
        System.out.println(mapa);
    }
}
