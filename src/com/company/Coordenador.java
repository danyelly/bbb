package com.company;

public class Coordenador extends Docentes{
    String nomeCurso;

    Coordenador(String nomeCurso, double salario, String nome, int idade, String email) {
        super(salario, nome, idade, email);
        this.nomeCurso = nomeCurso ;
    }
}
