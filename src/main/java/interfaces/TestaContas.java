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
public class TestaContas {

    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();
        ContaPoupanca c2 = new ContaPoupanca();

        c1.deposita(500);
        c2.deposita(500);

        c1.saca(100);
        c2.saca(100);

        System.out.println(String.valueOf(c1.getSaldo()));
        System.out.println(String.valueOf(c2.getSaldo()));
    }
}
