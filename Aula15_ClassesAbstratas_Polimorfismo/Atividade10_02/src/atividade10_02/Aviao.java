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
public class Aviao extends VeiculoAluguel{
    private float horasVoo;

    public Aviao(float horasVoo, String id, String marca, String modelo, boolean alugado) {
        super(id, marca, modelo, alugado);
        this.horasVoo = horasVoo;
    }

    public float getHorasVoo() {
        return horasVoo;
    }

    public void setHorasVoo(float horasVoo) {
        this.horasVoo = horasVoo;
    }
    
}
