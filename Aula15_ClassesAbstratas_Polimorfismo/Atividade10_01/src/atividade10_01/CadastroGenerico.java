/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade10_01;

import java.util.ArrayList;

/**
 *
 * @author lousa
 */
public class CadastroGenerico {
    private ArrayList<Pessoa> pessoas;
    public CadastroGenerico(){
        this.pessoas = new ArrayList<>();
    }
    public void incluir(Pessoa p){
        pessoas.add(p);
    }
    public void excluir(int id){
        pessoas.remove(id);
    }
    public Pessoa buscar(int id){
        return pessoas.get(id);
    }
    public ArrayList<Pessoa> buscarTodos(){
        return this.pessoas;
    }
    public int numeroPessoas(){
        return this.pessoas.size();
    }
}
