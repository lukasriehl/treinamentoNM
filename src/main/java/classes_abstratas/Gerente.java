/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_abstratas;

/**
 *
 * @author Lukas
 */
public class Gerente extends Funcionario {

    @Override
    public double calculaBonificacao() {
        return this.salario * 0.2;
    }

}
