/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacao_a_objetos;

/**
 *
 * @author lukas
 */
public class TestaMetodoTransfere {

    public static void main(String[] args) {
        Agencia a = new Agencia(1234);

        Conta origem = new Conta(a);
        origem.saldo = 1000;

        Conta destino = new Conta(a);
        origem.saldo = 1000;

        origem.transfere(destino, 500);

        System.out.println(origem.saldo);
        System.out.println(destino.saldo);
    }

}
