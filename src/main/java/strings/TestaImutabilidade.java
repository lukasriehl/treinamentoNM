/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author lukas
 */
public class TestaImutabilidade {

    public static void main(String[] args) {
        String nome = "Lukas Riehl";

        String nomeAlterado = nome.toUpperCase();

        System.out.println(nome);

        System.out.println(nomeAlterado);
    }

}
