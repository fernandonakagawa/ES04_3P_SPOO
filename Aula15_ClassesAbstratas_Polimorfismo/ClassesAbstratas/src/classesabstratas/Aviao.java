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
public class Aviao extends Veiculo{

    public Aviao(String nome) {
        super(nome);
    }


    @Override
    public void locomover(int forca) {
        System.out.println("Avião: VRUM");
    }

    @Override
    public void desacelerar(int forca) {
        System.out.println("Avião: riiiiiiiiii");
    }
    
}
