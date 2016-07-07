/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

/**
 *
 * @author lukas
 */
public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        f.setNome("Lukas");
        f.setSalario(1800);

        System.out.println(f);
    }

}
