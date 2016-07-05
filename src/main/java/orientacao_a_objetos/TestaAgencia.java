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
public class TestaAgencia {

    public static void main(String[] args) {

        Agencia a1 = new Agencia(1234);
        a1.numero = 1234;

        Agencia a2 = new Agencia(1234);
        a1.numero = 5678;

        System.out.println(a1.numero);

        System.out.println(a2.numero);
    }

}
