/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrocliente;

import javax.swing.JFrame;

/**
 *
 * @author lousa
 */
public class CadastroCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Cliente c1 = new Cliente("Fernando", "123123", "Rua Belém", "(43)44433333");
        BD banco = BD.getInstancia();
        banco.inserirCliente(c1);*/
        FormCadastroCliente form = new FormCadastroCliente();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
    }
    
}
