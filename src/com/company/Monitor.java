package com.company;

public class Monitor extends Discentes{
    double bolsa;
    boolean avaliacao;

    Monitor(String nome,  int idade, int ano, String email, double bolsa, boolean avaliacao) {
        super(ano, nome, idade, email);
        this.bolsa =bolsa;
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "bolsa=" + bolsa +
                ", avaliacao=" + avaliacao +
                '}';
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public boolean isAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(boolean avaliacao) {
        this.avaliacao = avaliacao;
    }
}
