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
public class TestaFuncionario2 {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        f.setNome("Lukas");
        f.setSalario(1800);

        Funcionario f2 = new Funcionario();

        f2.setNome("Lukas");
        f2.setSalario(1800);

        System.out.println(f == f2);
        System.out.println(f.equals(f2));
    }

}
