package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Disciplinas {
    public String nomeDisciplina;
    int cont = 0 ;

    ArrayList<Professor> professores = new ArrayList<Professor>();
    ArrayList<Monitor> monitores = new ArrayList<Monitor>();
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    Instituto inst = new Instituto();

    Disciplinas(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public Disciplinas() {}

    void popAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    void popProf(Professor professor){this.professores.add(professor);}

    void popMonitor(Monitor monitor){
        this.monitores.add(monitor);
    }

    void imprimiAlunos(){
        System.out.print("\n\n****** Alunos ******\n");
        for(Aluno aluno:alunos){
            System.out.println("Nome:" + aluno.nome);
        }
    }

    void imprimiProf(){
        System.out.print("\n\n****** Professores ******\n");
        for(Professor professor:professores){
            System.out.println("Nome:" + professor.nome);
        }
    }
    void imprimiMonitor(){
        System.out.print("\n\n****** Monitor ******\n");
        for(Monitor monitor:monitores){
            System.out.println("Nome:" + monitor.nome);
        }
    }
}
