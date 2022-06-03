/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesabstratas;

/**
 *
 * @author lousa
 */
public class Carro extends Veiculo {

    public Carro(String nome) {
        super(nome);
    }
    
    @Override
    public void locomover(int forca){
        super.locomover(forca);
        System.out.print("Carro: Vr");
        for(int i = 0; i < this.getVelocidade(); i++)
            System.out.print("u");
        System.out.println("m");
    }

    @Override
    public void desacelerar(int forca) {
        System.out.println("Carro: Screench");
    }

    
}
