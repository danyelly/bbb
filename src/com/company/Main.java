package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Disciplinas disciplina = new Disciplinas();
        Aluno aluno = new Aluno();
        Instituto instituto = new Instituto();
        Universidade uni = new Universidade();


//        INSTANCIANDO NOVOS ALUNOS
        Aluno newAluno1 = new Aluno(0, new double[]{0.0},100,true,2021,"Danyelly Silveira",18,"dany@gmail.com");
        newAluno1.addFalta(5);
        newAluno1.addProvas(new double[]{9.5, 10.0});
        newAluno1.aprovacao();

        Aluno newAluno2 = new Aluno(0, new double[]{0.0},100,true,2022,"Priscila Luca",19,"pri@gmail.com");
        newAluno2.addFalta(15);
        newAluno2.addProvas(new double[]{8.0, 5.0});
        newAluno2.aprovacao();

        Aluno newAluno3 = new Aluno(0, new double[]{0.0},100,true,2021,"Tasha Okere",18,"tasha@gmail.com");
        newAluno3.addFalta(2);
        newAluno3.addProvas(new double[]{6.0, 10.0});
        newAluno3.aprovacao();

        Aluno newAluno4 = new Aluno(0, new double[]{0.0},100,true,2020,"Eloisa Bianca",20,"elo@gmail.com");
        newAluno4.addFalta(6);
        newAluno4.addProvas(new double[]{7.0, 9.5});
        newAluno4.aprovacao();

        Aluno newAluno5 = new Aluno(0, new double[]{0.0},0,true,2020,"Eloisa Bianca",20,"elo@gmail.com");
        newAluno4.addFalta(6);
        newAluno4.addProvas(new double[]{7.0, 9.5});
        newAluno4.aprovacao();

//        Aluno newAluno5 = new Aluno(0, new double[]{0.0},0,true,2021,"Gabriela Campanha",19,"gabi@gmail.com");
//        newAluno4.addFalta(12);
//        newAluno4.addProvas(new double[]{5.0, 6.5});
//        newAluno4.aprovacao();
//
//        Aluno newAluno6 = new Aluno(0, new double[]{0.0},0,true,2021,"Nicolly Storoni",19,"nicki@gmail.com");
//        newAluno4.addFalta(15);
//        newAluno4.addProvas(new double[]{7.0, 7.5});
//        newAluno4.aprovacao();
//
//        Aluno newAluno7 = new Aluno(0, new double[]{0.0},0,true,2020,"Isabela Silas",19,"isa@gmail.com");
//        newAluno4.addFalta(6);
//        newAluno4.addProvas(new double[]{8.0, 9.5});
//        newAluno4.aprovacao();
//
//        Aluno newAluno8 = new Aluno(0, new double[]{0.0},0,true,2020,"A",20,"elo@gmail.com");
//        newAluno4.addFalta(6);
//        newAluno4.addProvas(new double[]{7.0, 9.5});
//        newAluno4.aprovacao();
//
//        Aluno newAluno9 = new Aluno(0, new double[]{0.0},0,true,2020,"B",20,"elo@gmail.com");
//        newAluno4.addFalta(6);
//        newAluno4.addProvas(new double[]{7.0, 9.5});
//        newAluno4.aprovacao();
//
//        Aluno newAluno10 = new Aluno(0, new double[]{0.0},0,true,2020,"C",20,"elo@gmail.com");
//        newAluno4.addFalta(6);
//        newAluno4.addProvas(new double[]{7.0, 9.5});
//        newAluno4.aprovacao();
//
//        Aluno newAluno11 = new Aluno(0, new double[]{0.0},0,true,2020,"D",20,"elo@gmail.com");
//        newAluno4.addFalta(6);
//        newAluno4.addProvas(new double[]{7.0, 9.5});
//        newAluno4.aprovacao();
//
//        Aluno newAluno12 = new Aluno(0, new double[]{0.0},0,true,2020,"E",20,"elo@gmail.com");
//        newAluno4.addFalta(6);
//        newAluno4.addProvas(new double[]{7.0, 9.5});
//        newAluno4.aprovacao();
//
//        Aluno newAluno13 = new Aluno(0, new double[]{0.0},0,true,2020,"F",20,"elo@gmail.com");
//        newAluno4.addFalta(6);
//        newAluno4.addProvas(new double[]{7.0, 9.5});
//        newAluno4.aprovacao();
//
//        Aluno newAluno14 = new Aluno(0, new double[]{0.0},0,true,2020,"G",20,"elo@gmail.com");
//        newAluno4.addFalta(6);
//        newAluno4.addProvas(new double[]{7.0, 9.5});
//        newAluno4.aprovacao();
//
//        Aluno newAluno15 = new Aluno(0, new double[]{0.0},0,true,2020,"H",20,"elo@gmail.com");
//        newAluno4.addFalta(6);
//        newAluno4.addProvas(new double[]{7.0, 9.5});
//        newAluno4.aprovacao();
//
//        Aluno newAluno16 = new Aluno(0, new double[]{0.0},0,true,2020,"I",20,"elo@gmail.com");
//        newAluno4.addFalta(6);
//        newAluno4.addProvas(new double[]{7.0, 9.5});
//        newAluno4.aprovacao();
//
//        Aluno newAluno17 = new Aluno(0, new double[]{0.0},0,true,2020,"J",20,"elo@gmail.com");
//        newAluno4.addFalta(6);
//        newAluno4.addProvas(new double[]{7.0, 9.5});
//        newAluno4.aprovacao();

//        INSTANCIANDO NOVAS DISCIPLINAS
        Disciplinas newDisp = new Disciplinas("Java");
        instituto.addDiscp(newDisp);
        Disciplinas newDisp2 = new Disciplinas("Python");
        instituto.addDiscp(newDisp2);
        Disciplinas newDisp3 = new Disciplinas("Banco de Dados");
        instituto.addDiscp(newDisp3);
        instituto.imprimiDisciplina();

//       ADICIONANDO ALUNO NAS DISCIPLINAS
        disciplina.popAluno(newAluno1);
        disciplina.popAluno(newAluno2);
        disciplina.popAluno(newAluno3);
        disciplina.popAluno(newAluno4);
//        disciplina.popAluno(newAluno5);
//        disciplina.popAluno(newAluno5);
//        disciplina.popAluno(newAluno6);
//        disciplina.popAluno(newAluno7);
//        disciplina.popAluno(newAluno8);
//        disciplina.popAluno(newAluno9);
//        disciplina.popAluno(newAluno10);
//        disciplina.popAluno(newAluno11);
//        disciplina.popAluno(newAluno12);
//        disciplina.popAluno(newAluno13);
//        disciplina.popAluno(newAluno14);
//        disciplina.popAluno(newAluno15);
//        disciplina.popAluno(newAluno16);
//        disciplina.popAluno(newAluno17);
        disciplina.imprimiAlunos();

//        ADICIONANDO DISCIPLINA E ALUNOS NO INSTITUTO
        instituto.addPessoaDisciplina(newAluno1,null,null);
        instituto.addPessoaDisciplina(newAluno2,null,null);
        instituto.addPessoaDisciplina(newAluno3,null,null);
        instituto.addPessoaDisciplina(newAluno4,null,null);
//        instituto.addPessoaDisciplina(newAluno5,null,null);
//        instituto.addPessoaDisciplina(newAluno5,null,null);
//        instituto.addPessoaDisciplina(newAluno6,null,null);
//        instituto.addPessoaDisciplina(newAluno6,null,null);
//        instituto.addPessoaDisciplina(newAluno7,null,null);
//        instituto.addPessoaDisciplina(newAluno8,null,null);
//        instituto.addPessoaDisciplina(newAluno9,null,null);
//        instituto.addPessoaDisciplina(newAluno10,null,null);
//        instituto.addPessoaDisciplina(newAluno11,null,null);
//        instituto.addPessoaDisciplina(newAluno12,null,null);
//        instituto.addPessoaDisciplina(newAluno13,null,null);
//        instituto.addPessoaDisciplina(newAluno14,null,null);
//        instituto.addPessoaDisciplina(newAluno15,null,null);
//        instituto.addPessoaDisciplina(newAluno16,null,null);
//        instituto.addPessoaDisciplina(newAluno17,null,null);
        instituto.imprimePessoaDisciplina(1);


//      INSTANCIANDO NOVOS PROFESSORES
        Professor prof = new Professor("ADS",7.000,"Pedro Silva",31,"pedro@gmail.com");
        Professor prof2 = new Professor("Ciência da Computação",7.000,"Bruna Oliveira",29,"bruna@gmail.com");
        Professor prof3 = new Professor("ADS",7.000,"Barbara Vitória",30,"barbara@gmail.com");

//       ADICIONANDO PROFESSORES NAS DISCIPLINAS
        disciplina.popProf(prof);
        disciplina.popProf(prof2);
        disciplina.popProf(prof3);
        disciplina.imprimiProf();

//        ADICIONANDO DISCIPLINA E PROFESSORES NO INSTITUTO
        instituto.addPessoaDisciplina(null,prof,null);
        instituto.addPessoaDisciplina(null,prof2,null);
        instituto.addPessoaDisciplina(null,prof3,null);
        instituto.imprimePessoaDisciplina(2);

//        INSTANCIANDO NOVOS MONITORES
        Monitor monitor = new Monitor("Caio",18,2021,"caio@gmail.com",2.000,true);
        Monitor monitor2 = new Monitor("Felipe",17,2021,"felipe@gmail.com",2.000,false);

//        ADICIONANDO MONITORES NAS DISCIPLINAS
        disciplina.popMonitor(monitor);
        disciplina.popMonitor(monitor2);
        disciplina.imprimiMonitor();

//        ADICIONANDO DISCIPLINA E MONITORES NO INSTITUTO
        instituto.addPessoaDisciplina(null,null, monitor);
        instituto.addPessoaDisciplina(null,null, monitor2);
        instituto.imprimePessoaDisciplina(3);

//        INSTANCIANDO NOVOS INSTITUTOS
        Instituto newInst = new Instituto("Tecnologia");
        Instituto newInst2 = new Instituto("Matemática");
        Instituto newInst3 = new Instituto("Física");

//        ADICIONANDO INSTITUTOS NAS UNIVERSIDADES
        uni.popInstituto(newInst);
        uni.popInstituto(newInst2);
        uni.popInstituto(newInst3);
        uni.imprimiInstituto();

//        INSTANCIANDO NOVAS UNIVERSIDADES
        Universidade newUni = new Universidade("ETS");
        Universidade newUni2 = new Universidade("SENAI");

//        ADICIONANDO UNIVERSIDADES
        uni.popUniversidade(newUni);
        uni.popUniversidade(newUni2);
        uni.imprimiUniversidade();

        instituto.aprova(disciplina.alunos, disciplina.monitores, disciplina.professores);
        System.out.println("----------------------------------------------------------");
//        System.out.println("Universidade:");
        for(int i = 0; i<uni.universidade.size(); i++){
            System.out.println(uni.universidade.get(i));
            for(int j = 0; j<uni.institutos.size(); j++){
                System.out.println(uni.institutos.get(j).nomeInst);
            }
        }


    }
}
