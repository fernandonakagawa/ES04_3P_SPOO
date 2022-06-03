/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade10_02;

import java.util.ArrayList;

/**
 *
 * @author lousa
 */
public class Cliente {
    private String nome;
    private String cpf;
    ArrayList<Aluguel> alugueis;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.alugueis = new ArrayList<>();
    }

    public boolean alugar(VeiculoAluguel v){
        Aluguel a = new Aluguel(v, this);
        if(a.iniciar()){
            v.setAlugado(true);
            return alugueis.add(a);
        }
        return false;
    }
    public boolean devolver(VeiculoAluguel v){
        for(Aluguel a: this.alugueis){
            if(a.getVeiculo() == v){
                a.finalizar();
                return true;
            }
        }
        return false;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(ArrayList<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
    
    
}
