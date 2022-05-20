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
public class Matematica {
    /*○	float regraDeTres(float n1, float n1Resposta, float n2)
○	float[] bhaskara(float a, float b, float c)
○	float hipotenusa(float catAdj, float catOposto)
○	float areaTrapezio(float bMenor, float bMaior, float h)
*/
    /**
     * n1Resposta 60 - n1 80
     * retorno x  - n2 100
     */
    public static float regraDeTres(float n1, float n1Resposta, float n2){
        float x = (n1Resposta * n2)/n1;
        return x;
    }
    public static float[] bhaskara(float a, float b, float c){
        double delta = (b*b)-4*a*c;
        float x1 = (-b + (float)Math.sqrt(delta))/ (2 * a);
        float x2 = (-b - (float)Math.sqrt(delta))/ (2 * a);
        float[] resp = {x1, x2};
        return resp;
    }
    
}
