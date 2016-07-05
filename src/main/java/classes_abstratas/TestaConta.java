/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_abstratas;

/**
 *
 * @author Lukas
 */
public class TestaConta {

    public static void main(String[] args) {
        Conta c = new ContaPoupanca();

        c.setSaldo(1000);

        c.imprimeExtratoDetalhado();

    }

}
