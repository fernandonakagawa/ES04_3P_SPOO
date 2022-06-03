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
public abstract class Veiculo implements IVeiculo, IObjetoFisico {
    public static int num = 1000;
    
    private String nome;
    private int numeroSerie;
    private int velocidade;
    private int massa;
    
    /*public void locomover(){
        System.out.println("Veículo se locomove");
    }*/
    
    public Veiculo(String nome) {
        this.nome = nome;
        this.numeroSerie = num++;
        this.velocidade = 0;
    }
    
    @Override
    public void locomover(int forca){
        this.velocidade += forca;
    }
    
    @Override
    public void desacelerar(int forca) {
        this.velocidade -= forca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public int getNumeroSerie() {
        return this.numeroSerie;
    }

    @Override
    public int getVelocidade() {
        return this.velocidade;
    }

    @Override
    public int getMassa() {
        return this.massa;
    }
    
    
    
}
