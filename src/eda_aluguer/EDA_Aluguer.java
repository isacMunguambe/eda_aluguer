/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eda_aluguer;

import BaseDeDados.BD;
import Objectos.Cliente;

/**
 *
 * @author isacl
 */
public class EDA_Aluguer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BD bd = new BD();
        Cliente c = new Cliente(0, "POw", "Morooo", "1234B", "Cartao");
        
        bd.addCliente(c);
        
    }
    
}
