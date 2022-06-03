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
public class VeiculoAluguel {
    private String id;
    private String marca;
    private String modelo;
    private boolean alugado;

    public VeiculoAluguel(String id, String marca, String modelo, boolean alugado) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.alugado = alugado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
}
