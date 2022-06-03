package com.company;

import java.util.ArrayList;

public class Aluno extends Discentes{
    public double media;
    double[] provas = new double[5];
    int presenca = 100;
    boolean status;
    double mediaTotal;

    Aluno(double media, double[] provas, int presenca, boolean status,int ano, String nome, int idade, String email) {
        super(ano, nome, idade, email);
        this.media = media;
        this.provas = provas;
        this.presenca = presenca;
        this.status = status;
    }

    public Aluno() {}


    void addFalta(int faltaP){
        this.presenca = this.presenca - faltaP;
    }
    
    void addProvas(double[] provasP){
        this.provas = provasP;
        for(int i=0; i< provasP.length; i++){
              this.media = provasP[i] + this.media;
        }
        this.media = this.media/ provasP.length;
    }

    void provasValor(){
        System.out.printf("Provas:");
        for(int i=0; i< this.provas.length; i++){
            System.out.printf(" "+String.valueOf(this.provas[i]));
        }
    }

    void aprovacao(){
        if(mediaTotal>=5 || this.presenca>=75){
            this.status = true;
        }
        else
            this.status=false;
    }
}
