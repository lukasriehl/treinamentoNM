/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Lukas
 */
public class ContaCorrente implements Conta {

    private double saldo;
    private double taxaPorOperacao = 0.45;

    @Override
    public void deposita(double valor) {
        this.saldo += valor - this.taxaPorOperacao;
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor + this.taxaPorOperacao;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

}
