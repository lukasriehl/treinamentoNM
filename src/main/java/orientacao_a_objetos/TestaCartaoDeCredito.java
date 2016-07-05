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
public class TestaCartaoDeCredito {

    public static void main(String[] args) {

        CartaoDeCredito cdc1 = new CartaoDeCredito(111111);
        //cdc1.numero = 111111;
        cdc1.dataDeValidade = "01/01/2013";

        CartaoDeCredito cdc2 = new CartaoDeCredito(222222);
        //cdc2.numero = 222222;
        cdc2.dataDeValidade = "01/01/2014";

        System.out.println(cdc1.numero);
        System.out.println(cdc1.dataDeValidade);

        System.out.println(cdc2.numero);
        System.out.println(cdc2.dataDeValidade);
    }

}
