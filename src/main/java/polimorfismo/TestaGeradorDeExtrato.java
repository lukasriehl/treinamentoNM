/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Lukas
 */
public class TestaGeradorDeExtrato {
    
    public static void main(String[] args) {
        
        GeradorDeExtrato gerador = new GeradorDeExtrato();
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.setSaldo(1000);
        
        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(1000);
        
        gerador.imprimeExtratoBasico(cp);
        gerador.imprimeExtratoBasico(cc);
        
    }
    
}
