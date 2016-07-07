/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoes;

/**
 *
 * @author lukas
 */
public class TestaFuncionario {

    public static void main(String[] args) {
        try {
            Funcionario f = new Funcionario();
            f.aumentaSalario(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Houve um IllegalArgumentException ao aumentar o salário.");
        }
    }

}
