/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade10_01;

import java.util.Date;

/**
 *
 * @author lousa
 */
public class Atividade10_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno(0, "Anthon", "123456789", 
                "4399999", "1000a", new Date(2022, 01, 10));
        Aluno a2 = new Aluno(0, "Lucas", "123456780", 
                "43999699", "1001a", new Date(2022, 01, 12));
        Pessoa p1 = new Pessoa(0, "João", "123456787", 
                "439996799");
        CadastroAluno ca = new CadastroAluno();
        ca.incluir(a1);
        ca.incluir(a2);
        ca.incluir(p1);
        for (Pessoa p: ca.buscarTodos()){
            //p.getRegistroAcademico();
            if(p instanceof Aluno){
                Aluno a = (Aluno)p;
                System.out.println(a.getRegistroAcademico() 
                        + " " + a.getNome());
            }
            else{
                System.out.println(p.getNome() + " não é um aluno");
            }
        }
    }
    
}
