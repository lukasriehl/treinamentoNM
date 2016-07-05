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
public class TestaTurma {

    public static void main(String[] args) {

        Turma t1 = new Turma();

        t1.periodo = "matutino";
        t1.serie = 5;
        t1.sigla = "AB";
        t1.tipoEnsino = "Fundamental";

        System.out.println(t1.periodo);
        System.out.println(t1.serie);
        System.out.println(t1.sigla);
        System.out.println(t1.tipoEnsino);
    }

}
