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
public class TestaCliente {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.nome = "Lukas";
        c1.codigo = 1;

        Cliente c2 = new Cliente();
        c2.nome = "João";
        c2.codigo = 2;

        System.out.println(c1.nome);
        System.out.println(c1.codigo);

        System.out.println(c2.nome);
        System.out.println(c2.codigo);
    }

}
