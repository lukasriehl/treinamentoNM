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
public abstract class Conta {

    private double saldo;

    public abstract void imprimeExtratoDetalhado();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
