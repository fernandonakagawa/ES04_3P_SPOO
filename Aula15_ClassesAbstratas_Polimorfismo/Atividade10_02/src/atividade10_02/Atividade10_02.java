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
public class Atividade10_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locadora locadora = new Locadora("Encontra", "Rua Pará");
        Carro c1 = new Carro("ABC1234", 100, "1000", "VW", "Fusca", false);
        Aviao a1 = new Aviao(1000, "1999223", "Boeing", "Teco teco", false);
        Carro c2 = new Carro("ABC1233", 101, "1001", "Fiat", "147", false);
        
        locadora.AdicionarVeiculoAluguel(c1);
        locadora.AdicionarVeiculoAluguel(a1);
        locadora.AdicionarVeiculoAluguel(c2);
        
        for(VeiculoAluguel v: locadora.getVeiculosDisponiveis()){
            System.out.println(v.getModelo());
        }
        
        Cliente cliente1 = new Cliente("Otavio", "123123");
        if(locadora.EfetuarAluguel(c2, cliente1)){
            System.out.println("Aluguel efetuado com sucesso!");
        }
        else{
            System.out.println("Aluguel indisponível");
        }
        
        for(VeiculoAluguel v: locadora.getVeiculosDisponiveis()){
            System.out.println(v.getModelo());
        }
        
        
    }
    
}
