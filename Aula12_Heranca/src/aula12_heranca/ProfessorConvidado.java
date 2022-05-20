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
public class ProfessorConvidado extends Professor {
    private String instituicaoOrigem;

    public ProfessorConvidado(String instituicaoOrigem, 
            String registroFuncionario, ArrayList<String> disciplinasLecionadas,
            String nome, String cpf, String telefone) {
        super(registroFuncionario, disciplinasLecionadas, nome, cpf, telefone);
        this.instituicaoOrigem = instituicaoOrigem;
    }
    public String getInstituicaoOrigem() {
        return instituicaoOrigem;
    }

    public void setInstituicaoOrigem(String instituicaoOrigem) {
        this.instituicaoOrigem = instituicaoOrigem;
    }
    @Override
    public String getRegistroFuncionario(){
        return "Sem registro";
    }
}
