package com.company;

public class Professor extends Docentes{
    String formacao;

    Professor(String formacao, double salario, String nome, int idade, String email) {
        super(salario, nome, idade, email);
        this.formacao = formacao ;
    }
}
