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
public class TestaAluno {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        a1.nome = "Jose";
        a1.rg = "1234567";
        a1.dataDeNascimento = "10/03/1990";
        
        Aluno a2 = new Aluno();
        a2.nome = "Maria";
        a2.rg = "1234568";
        a2.dataDeNascimento = "10/08/1992";
        
        System.out.println(a1.nome);
        System.out.println(a1.rg);
        System.out.println(a1.dataDeNascimento);
        
        System.out.println(a2.nome);
        System.out.println(a2.rg);
        System.out.println(a2.dataDeNascimento);
    }
    
}
