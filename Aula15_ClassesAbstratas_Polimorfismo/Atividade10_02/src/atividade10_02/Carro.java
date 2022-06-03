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
public class Carro extends VeiculoAluguel{
    private String placa;
    private float km;

    public Carro(String placa, float km, 
            String id, String marca, 
            String modelo, boolean alugado) {
        super(id, marca, modelo, alugado);
        this.placa = placa;
        this.km = km;
    }
    
}
