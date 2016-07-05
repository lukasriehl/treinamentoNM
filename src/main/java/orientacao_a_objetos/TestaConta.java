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
public class TestaConta {

    public static void main(String[] args) {

        Agencia a1 = new Agencia(111111);

        Conta c1 = new Conta(a1);
        c1.numero = 1234;
        c1.saldo = 1000;
        c1.limite = 500;

        Conta c2 = new Conta(a1);
        c2.numero = 5678;
        c2.saldo = 2000;
        c2.limite = 250;

        System.out.println(c1.agencia.numero);
        System.out.println(c1.numero);
        System.out.println(c1.saldo);
        System.out.println(c1.limite);

        System.out.println(c2.agencia.numero);
        System.out.println(c2.numero);
        System.out.println(c2.saldo);
        System.out.println(c2.limite);
    }

}
