/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Lukas
 */
public class TestaGeradorDeExtrato {
    
    public static void main(String[] args) {
        
        ContaCorrente c1 = new ContaCorrente();
        ContaPoupanca c2 = new ContaPoupanca();
        
        c1.deposita(500);
        c2.deposita(500);
        
        GeradorDeExtrato g = new GeradorDeExtrato();
        g.geraExtrato(c1);
        g.geraExtrato(c2);
    }
    
}
