/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentacao.contas;

/**
 * Documentação da classe Conta
 *
 * @author lukas
 *
 * @version 1.0
 */
public class Conta {

    /**
     * Documentação do atributo número
     */
    private int numero;

    /**
     * Documentação do construtor
     *
     * @param numero documentação do atributo numero
     *
     * @throws IllegalArgumentException
     *
     * documentação da situação que gera a exception IllegalArgumentException
     */
    public Conta(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("número negativo");
        }
    }

    /**
     * Documentação do método getNumero
     * 
     * @return documentação do valor de retorno 
     */
    public int getNumero() {
        return this.numero;
    }

}
