/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_resolucao_static;

/**
 *
 * @author SESI
 */
public class Aula12_Resolucao_Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float valor = Matematica.regraDeTres(80, 60, 100);
        System.out.println(valor);
        float valoresBhaskara[] = Matematica.bhaskara(1, 12, -13);
        System.out.println("x' = " + valoresBhaskara[0] + " x'' = " + valoresBhaskara[1]);
        System.out.println(ConversaoVolume.litrosParaCm3(3.14f));
        System.out.println(ConversaoVolume.m3ParaLitros(6f));
        System.out.println(ConversaoVolume.m3ParaPes3(6f));
        System.out.println(ConversaoVolume.galaoAmParaLitros(2f));
        System.out.println(
                ConversaoVolume.litrosParaCm3(
                        ConversaoVolume.galaoAmParaLitros(1f)));
    }
    
}
