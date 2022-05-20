/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_heranca;

/**
 *
 * @author SESI
 */
public class Aluno extends Pessoa{
    private String registroAluno;

    public Aluno(String registroAluno, String nome, 
            String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.registroAluno = registroAluno;
    }

    public String getRegistroAluno() {
        return registroAluno;
    }
    
    
}
