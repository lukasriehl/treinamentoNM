/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotes.testes;

import pacotes.sistema.Conta;

/**
 *
 * @author Lukas
 */
public class Teste {
    
    public static void main(String[] args) {
        Conta c = new Conta();
        c.deposita(1000);
        System.out.println(String.valueOf(c.getSaldo()));
        
    }
    
}
