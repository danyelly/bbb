package com.company;

import java.util.ArrayList;

public class Instituto {
    public String nomeInst;
    int cont =0;
    String pessoa ="";
    String[] array = new String[20];
    String registro = "";
    String registroP = "";
    ArrayList<Disciplinas> disciplinas = new ArrayList<Disciplinas>();

    Instituto(String nome){
        this.nomeInst = nome;
    }

    public Instituto(){}

    //    array de que add aluno em uma disciplina
    ArrayList<String> discpAluno = new ArrayList<String>();
    ArrayList<String> professor = new ArrayList<String>();
    ArrayList<String> monitor = new ArrayList<String>();

    // add disciplina
    void addDiscp(Disciplinas discpV){
        this.disciplinas.add(discpV);
    }

    void imprimiDisciplina(){
        System.out.printf("\n****** disciplina ******\n");
        for(Disciplinas value:disciplinas){
            System.out.println("Nome:" + value.nomeDisciplina);
        }
    }

    void addPessoaDisciplina(Aluno aluno, Professor prof, Monitor monitorP){
        if (prof!=null){
            if (cont == 3){
                cont = 0;
            }

            String nomeDiscp = this.disciplinas.get(cont).nomeDisciplina;

            registroP = nomeDiscp + ", " + prof.nome + " - "  + prof.email + " - "  + prof.idade + " - "  + prof.formacao + " - "  + prof.salario;

            this.professor.add(registroP);

            cont+=1;
        }
        if (aluno!=null){
            if (cont == 3){
                cont = 0;
            }

            String nomeDiscp = this.disciplinas.get(0).nomeDisciplina;

            registro = nomeDiscp + ", " + aluno.nome + " - "  + aluno.email + " - "  + aluno.idade + " - "  + aluno.ano + " - "  + aluno.status
                    + " - "  + aluno.presenca + " - "  + aluno.provas[0] + " - "  + aluno.provas[1] + " - "  + aluno.media;

            this.discpAluno.add(registro);

            cont+=1;
        }
        if (monitorP!=null){
            if (cont == 3){
                cont = 0;
            }

            String nomeDiscp = this.disciplinas.get(0).nomeDisciplina;

            registro = nomeDiscp + ", " + monitorP.nome + " - "  + monitorP.email + " - "  + monitorP.idade + " - "  + monitorP.ano + " - "  + monitorP.avaliacao
                    + " - "  + monitorP.bolsa;

            this.monitor.add(registro);

            cont+=1;
        }
    }

    void aprova(ArrayList<Aluno> alunos,  ArrayList<Monitor> monitores, ArrayList<Professor> professores){

        float tam = alunos.size();
        float porcentagem;
        porcentagem = (float) (0.8 * tam);
        int cont = 0;
        int cont2 = 0;
        int cont3 = 0;

        float metade = tam/2;

        for(String dado: this.discpAluno){
            String[] parts2 = dado.split(",");
            String part12 = parts2[0];
            String part22 = parts2[1];

            String[] part3 = parts2[1].split("-");
            String status = part3[4];
            if(part12.equals("Java")){
                if(status.equals(" true ")){
                    cont=cont+1;
                }
            }
            if(part12.equals("Python")){
                if(status.equals(" true ")){
                    cont2=cont2+1;
                }
            }
            if(part12.equals("Banco de Dados")){
                if(status.equals(" true ")){
                    cont3=cont3+1;
                }
            }
        }

        if(cont>porcentagem || cont2>porcentagem || cont3> porcentagem){
            System.out.println("Aumento da Disciplina de Java");
            for(int i=0; i<monitores.size(); i++)
            for(Monitor m: monitores){
                    m.bolsa +=(m.bolsa* 0.05);
                    m.avaliacao = true;
                    System.out.printf("bolsa depois %f",m.bolsa);
                }

            }
            for(Professor p: professores){
                System.out.printf("salario antes %f",p.salario);
                p.salario +=(p.salario* 0.05);
                System.out.printf("salario depois %f",p.salario);
            }
        }

        if(cont<2){
            for(Monitor m: monitores){
                System.out.printf("bolsa antes %f",m.bolsa);
                m.bolsa -=(m.bolsa* 0.05);
                m.avaliacao = false;
                System.out.printf("bolsa depois %f",m.bolsa);
            }
            for(Professor p: professores){
                System.out.printf("salario antes %f",p.salario);
                p.salario -=(p.salario* 0.05);
                System.out.printf("salario depois %f",p.salario);
            }
        }
    }

    void imprimePessoaDisciplina(int valor){

        for(int j=0; j<this.disciplinas.size(); j++){
            if(valor==1){
                String[] array2 = this.discpAluno.toArray(new String[0]);
                pessoa = "Aluno";
                array = array2;
            }

            if(valor==2){
                String[] array2 = this.professor.toArray(new String[0]);
                pessoa = "Professor";
                array = array2;
            }

            if(valor==3){
                String[] array2 = this.monitor.toArray(new String[0]);
                pessoa = "Monitor";
                array = array2;
            }

            for(int i=0; i<array.length; i++){
                String[] parts2 = array[i].split(",");
                String part12 = parts2[0];
                String part22 = parts2[1];

                String disciplina = this.disciplinas.get(j).nomeDisciplina;

                if(disciplina.equals(part12)){
                    System.out.printf("\nDisciplina: %s",part12);
                    System.out.printf("\n%s: %s",pessoa,part22);
                    System.out.printf("\n");
                }
            }
        }
    }

}


