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
public class TestaValoresPadrao {

    public static void main(String[] args) {

        Agencia a = new Agencia(2222222);
        Conta c = new Conta(a);

        System.out.println(c.numero);
        System.out.println(c.limite);
        System.out.println(c.saldo);
    }

}
