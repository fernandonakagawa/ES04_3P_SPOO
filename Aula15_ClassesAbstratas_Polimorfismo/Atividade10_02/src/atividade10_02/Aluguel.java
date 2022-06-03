/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade10_02;

/**
 *
 * @author lousa
 */
public class Aluguel {
    private VeiculoAluguel veiculo;
    private Cliente cliente;
    private boolean ativo;

    public Aluguel(VeiculoAluguel veiculo, Cliente cliente) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.ativo = false;
    }
    public boolean iniciar(){
        if(!ativo){
            ativo = true;
            return true;
        }
        return false;
    }
    public boolean finalizar(){
        if(ativo){
            ativo = false;
            return true;
        }
        return false;
    }

    public VeiculoAluguel getVeiculo() {
        return veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean isAtivo() {
        return ativo;
    }
    
    
}
