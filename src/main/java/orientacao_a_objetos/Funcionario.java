/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacao_a_objetos;

/**
 *
 * @author Lukas
 */
public class Funcionario {

    String nome;
    double salario = 1000.00;

    void aumentarSalario(double valor) {
        this.salario += valor;
    }

    void consultarDados() {
        System.out.println(this.nome);
        System.out.println(this.salario);
    }

}
