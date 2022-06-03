package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Universidade {
    String nome;
    ArrayList<Instituto> institutos= new ArrayList<Instituto>();
    ArrayList<String> universidade= new ArrayList<String>();

    Universidade(String nomeUni){
        this.nome = nomeUni;
    }

    Universidade(){}

    void popInstituto(Instituto instituto){
        this.institutos.add(instituto);
    }

    void popUniversidade(Universidade nomeUni){
        this.universidade.add(nomeUni.nome);
    }

    void imprimiInstituto(){
        System.out.print("\n\n****** Institutos ******\n");
        for(Instituto instituto:institutos){
            System.out.println("Nome:" + instituto.nomeInst);
        }
    }

    void imprimiUniversidade(){
        System.out.print("\n\n****** Universidade ******\n");
        for(String uni:universidade){
            System.out.println("Nome:" + uni);
        }
    }
}
