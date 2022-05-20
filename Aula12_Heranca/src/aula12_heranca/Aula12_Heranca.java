/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_heranca;

import java.util.ArrayList;

/**
 *
 * @author SESI
 */
public class Aula12_Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Anthon", "123123", "(43)99999");
        Aluno a1 = new Aluno("123A", "Claudio", "123124", "(43)99998");
        Professor prof1 = new Professor("124P", new ArrayList<String>(), "Daniel",
        "123125", "(43)99997");
        ProfessorConvidado pc1 = new ProfessorConvidado("UNIFAFUP", "125PC", new ArrayList<String>(),
        "Enzo", "123126", "(43)99996");
        System.out.println(pc1.getNome() +  " " + pc1.getRegistroFuncionario() + " " + pc1.getInstituicaoOrigem());
        //System.out.println(prof1.getNome() +  " " + prof1.getRegistroFuncionario() + " " + prof1.getInstituicaoOrigem());
        //System.out.println(a1.getNome() +  " " + a1.getRegistroFuncionario() + " " + a1.getInstituicaoOrigem());
        System.out.println(a1.getNome() +  " " + a1.getRegistroAluno()+ " ");
        //System.out.println(pc1.getRegistroAluno());
        if (pc1 instanceof Professor){
            System.out.println("Sim");
        }
        System.out.println(pc1.getRegistroFuncionario());
        System.out.println(prof1.getRegistroFuncionario());
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(a1);
        pessoas.add(prof1);
        pessoas.add(pc1);
        
        System.out.println("");
        for(Pessoa p: pessoas){
            System.out.print(p.getNome());
            if(p instanceof Aluno){
                Aluno a = (Aluno)p;
                System.out.print(" RA: " + a.getRegistroAluno());
            }
            else if (p instanceof Professor){
                Professor prof = (Professor)p;
                System.out.print(" RF: " + prof.getRegistroFuncionario());
                if (prof instanceof ProfessorConvidado){
                    ProfessorConvidado pc = (ProfessorConvidado)prof;
                    System.out.print(" Inst. Orig.: " + pc.getInstituicaoOrigem());
                }
            }
            System.out.println("");
        }
        
    }
    
}
