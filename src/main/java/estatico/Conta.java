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
public class Conta {

    static int contador;

    int numero;

    Conta() {
        Conta.contador++;
        this.numero = Conta.contador;
    }

    static void zerarContador() {
        System.out.println("Contador: " + Conta.contador);
        System.out.println("Zerando o contador de contas...");
        Conta.contador = 0;
    }

}
