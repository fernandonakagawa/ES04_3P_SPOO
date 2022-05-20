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
public class ConversaoVolume {
    public static float litrosParaCm3(float litros){
        return litros*1000;
    }
    public static float m3ParaLitros(float m3){
        return m3*1000;
    }
    public static float m3ParaCm3(float m3){
        //float litros = m3ParaLitros(m3);
        return litrosParaCm3(m3ParaLitros(m3));
    }
    public static float m3ParaPes3(float m3){
        return m3*35.32f;
    }
    
    public static float galaoAmParaLitros(float galoes){
        return galoes * 3.785f;
    }
}
