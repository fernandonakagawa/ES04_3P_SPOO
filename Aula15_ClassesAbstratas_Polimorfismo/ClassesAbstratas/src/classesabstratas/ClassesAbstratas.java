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
public class ClassesAbstratas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Veiculo v = new Veiculo();
        Carro c = new Carro("Brasília Amarela");
        Aviao a = new Aviao("Boeing 747");
        c.locomover(10);
        a.locomover(1000);
        c.desacelerar(10);
        a.desacelerar(1000);
    }
    
}
