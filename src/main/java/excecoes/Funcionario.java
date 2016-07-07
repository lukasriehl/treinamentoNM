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
public class Funcionario {

    public void aumentaSalario(double aumento) {
        if (aumento < 0) {
            IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
        }
    }

}
