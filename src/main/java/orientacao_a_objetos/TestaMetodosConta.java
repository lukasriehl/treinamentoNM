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
public class TestaMetodosConta {

    public static void main(String[] args) {
        Agencia a = new Agencia(111111);
        Conta c = new Conta(a);

        c.deposita(1000);
        c.imprimeExtrato();

        c.saca(100);
        c.imprimeExtrato();

        double saldoDisponivel = c.consultaSaldoDisponivel();
        System.out.println("SALDO DISPONÍVEL: " + saldoDisponivel);

    }

}
