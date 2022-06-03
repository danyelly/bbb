package com.company;

public class Diretor extends Docentes{
    String instituto;

    Diretor(String instituto, double salario, String nome, int idade, String email) {
        super(salario, nome, idade, email);
        this.instituto = instituto ;
    }
}
