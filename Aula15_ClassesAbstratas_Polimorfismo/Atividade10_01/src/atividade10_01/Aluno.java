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
public class Aluno extends Pessoa{
    private String registroAcademico;
    private Date dataCadastro;
    public Aluno(int id, String nome, String cpf, String telefone, 
            String registroAcademico, Date dataCadastro) {
        super(id, nome, cpf, telefone);
        this.registroAcademico = registroAcademico;
        this.dataCadastro = dataCadastro;
    }

    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
}
