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
public class TestaClienteECartao {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.nome = "Lukas";
        c1.codigo = 1;

        CartaoDeCredito cdc = new CartaoDeCredito(11111);
        //cdc.numero = 11111;
        cdc.dataDeValidade = "20/01/2020";
        cdc.cliente = c1;

        System.out.println(cdc.numero);
        System.out.println(cdc.cliente.nome);
    }

}
