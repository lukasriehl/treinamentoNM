/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author Lukas
 */
public class TesteConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.setNumero(123456);
        c1.setSaldo(1000);
        c1.setTipo("Conta poupança");

        System.out.println("Número da conta = " + String.valueOf(c1.getNumero()));
        System.out.println("Saldo da conta = " + String.valueOf(c1.getSaldo()));
        System.out.println("Tipo da conta = " + String.valueOf(c1.getTipo()));
    }

}
