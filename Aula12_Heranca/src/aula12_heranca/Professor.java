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
public class Professor extends Pessoa{
    private String registroFuncionario;
    private ArrayList<String> disciplinasLecionadas;

    public Professor(String registroFuncionario, 
            ArrayList<String> disciplinasLecionadas, 
            String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.registroFuncionario = registroFuncionario;
        this.disciplinasLecionadas = disciplinasLecionadas;
    }

    public String getRegistroFuncionario() {
        return registroFuncionario;
    }

    public ArrayList<String> getDisciplinasLecionadas() {
        return disciplinasLecionadas;
    }
    public void adicionarDisciplina(String disciplina){
        this.disciplinasLecionadas.add(disciplina);
    }
    public void adicionarDisciplina(ArrayList<String> disciplinas){
        this.disciplinasLecionadas.addAll(disciplinas);
    }
}
