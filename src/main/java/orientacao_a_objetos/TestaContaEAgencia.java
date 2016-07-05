/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacao_a_objetos;

/**
 *
 * @author Lukas
 */
public class TestaContaEAgencia {

    public static void main(String[] args) {

        Agencia a = new Agencia(1234);
        Conta c = new Conta(a);

        //a.numero = 1111;
        c.saldo = 1000.0;
        c.agencia = a;

        System.out.println(c.agencia.numero);
        System.out.println(c.saldo);

    }

}
