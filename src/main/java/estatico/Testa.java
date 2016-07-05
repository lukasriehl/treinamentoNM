/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico;

/**
 *
 * @author Lukas
 */
public class Testa {

    public static void main(String[] args) {

        System.out.println("Contador: " + Conta.contador);

        Conta c1 = new Conta();
        System.out.println("Número da primeira conta: " + c1.numero);

        System.out.println("Contador: " + Conta.contador);

        Conta c2 = new Conta();
        System.out.println("Número da segunda conta: " + c2.numero);

        System.out.println("Contador: " + Conta.contador);

        Conta.zerarContador();
    }

}
