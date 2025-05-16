package com.pootrabalho.paises.entity;

public class Paises {
    private String nome;
    private String capital;
    private String continente;
    private String bandeiraUrl;

    public Paises() {
    }

    public Paises(String nome, String capital, String continente, String bandeiraUrl) {
        this.nome = nome;
        this.capital = capital;
        this.continente = continente;
        this.bandeiraUrl = bandeiraUrl;
    }

    public String getNome() { return nome; }
    public String getCapital() { return capital; }
    public String getContinente() { return continente; }
    public String getBandeiraUrl() { return bandeiraUrl; }
}
