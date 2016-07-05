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
public class Funcionario {

    String nome;
    double salario;
    static double valeRefeicaoDiario;

    Funcionario() {
        Funcionario.valeRefeicaoDiario = 17;
    }

    static void reajusteValeRefeicaoDiario(double taxa) {
        Funcionario.valeRefeicaoDiario += Funcionario.valeRefeicaoDiario * taxa;
    }

}
