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
public class TestaGerente {

    public static void main(String[] args) {
        Gerente g = new Gerente();

        g.nome = "Jorge";
        g.salario = 2000;

        System.out.println("Salario = " + g.salario);

        System.out.println("Aumentando o salário em 10%");
        g.aumentaSalario();

        System.out.println("Salario = " + g.salario);

        System.out.println("Aumentando o salário em 30%");
        g.aumentaSalario(0.3);

        System.out.println("Salario = " + g.salario);
    }

}
