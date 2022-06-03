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
public class Locadora {
    private String nome;
    private String endereco;
    private ArrayList<VeiculoAluguel> veiculosAluguel;
    private ArrayList<Aluguel> alugueisAtuais;

    public Locadora(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.veiculosAluguel = new ArrayList<>();
        this.alugueisAtuais = new ArrayList<>();
    }

    public void AdicionarVeiculoAluguel(VeiculoAluguel a){
        this.veiculosAluguel.add(a);
    }
    public void RemoverVeiculoAluguel(VeiculoAluguel a){
        
    }
    public boolean EfetuarAluguel(VeiculoAluguel v, Cliente c){
        return c.alugar(v);
    }
    
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public ArrayList<VeiculoAluguel> getVeiculosDisponiveis() {
        ArrayList<VeiculoAluguel> veiculosDisponiveis = new ArrayList<>();
        for(VeiculoAluguel v: this.getVeiculosAluguel()){
            if(!v.isAlugado()) veiculosDisponiveis.add(v);
        }        
        return veiculosDisponiveis;
    }

    public ArrayList<VeiculoAluguel> getVeiculosAluguel() {
        return veiculosAluguel;
    }

    public ArrayList<Aluguel> getAlugueisAtuais() {
        return alugueisAtuais;
    }
    
    
}
