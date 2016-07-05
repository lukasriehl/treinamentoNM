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
public class Gerente {

    String nome;
    double salario;

    void aumentaSalario() {
        this.aumentaSalario(0.1);
    }

    void aumentaSalario(double taxa) {
        this.salario += this.salario * taxa;
    }

}
