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
public class Conta {

    int numero;
    double saldo;
    double limite = 100;
    Agencia agencia;

    public Conta(Agencia agencia) {
        this.agencia = agencia;
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    void saca(double valor) {
        this.saldo -= valor;
    }

    void imprimeExtrato() {
        System.out.println("SALDO: " + this.saldo);
    }

    double consultaSaldoDisponivel() {
        return this.saldo + this.limite;
    }

    void transfere(Conta destino, double valor) {
        this.saldo -= valor;
        destino.saldo += valor;
    }

}
