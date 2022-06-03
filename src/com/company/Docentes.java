package com.company;

public class Docentes extends Membro{
    public double salario;

    Docentes(double salario, String nome, int idade, String email) {
        super(nome, idade, email);
        this.salario = salario;
    }

    public Docentes() {
        super();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
