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
public interface IVeiculo {
    public static String TIPO = "Veiculo";
    public void locomover(int forca);
    public void desacelerar(int forca);
    public int getNumeroSerie();
    
}
