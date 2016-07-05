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
public class Teste {

    public static void main(String[] args) {

        Funcionario f = new Funcionario();

        f.setNome("Lukas");
        f.setSalario(1800);

        System.out.println("Nome = " + f.getNome());
        System.out.println("Salário = " + String.valueOf(f.getSalario()));

    }

}
