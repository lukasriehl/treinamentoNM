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
public class TestaAlunoETurma {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();

        a1.nome = "Lukas";
        a1.rg = "477507876";
        a1.dataDeNascimento = "10/06/1991";

        Turma t1 = new Turma();

        t1.periodo = "vespertino";
        t1.serie = 6;
        t1.sigla = "AB";
        t1.tipoEnsino = "Fundamental";

        a1.turma = t1;

        System.out.println(a1.nome);
        System.out.println(t1.periodo);
        System.out.println(t1.tipoEnsino);
    }

}
