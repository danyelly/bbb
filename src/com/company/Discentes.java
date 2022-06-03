package com.company;

public class Discentes extends Membro{
    int ano;

    Discentes(int ano,String nome, int idade, String email) {
        super(nome, idade, email);
        this.ano = ano;
    }


    public Discentes() {

    }
}
