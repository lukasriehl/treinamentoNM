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
public class TestaFuncionario {

    public static void main(String[] args) {

        new Funcionario();

        System.out.println("Valor do vale refeição diário antes do ajuste = " + String.valueOf(Funcionario.valeRefeicaoDiario));

        Funcionario.reajusteValeRefeicaoDiario(0.1);

        System.out.println("Valor do vale refeição diário após o ajuste = " + String.valueOf(Funcionario.valeRefeicaoDiario));

    }

}
