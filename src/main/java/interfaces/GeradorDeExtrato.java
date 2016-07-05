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
public class GeradorDeExtrato {

    public void geraExtrato(Conta c) {
        System.out.println("EXTRATO");
        System.out.println("SALDO: " + c.getSaldo());
    }

}
