/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_abstratas;

/**
 *
 * @author Lukas
 */
public class TestaFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario f = new Gerente();
        
        f.setNome("Marcos");
        f.setSalario(2500);
        
        System.out.println("Nome: " + f.getNome());
        System.out.println("Salário: " + String.valueOf(f.getSalario()));
        System.out.println("Bonificação: " + String.valueOf(f.calculaBonificacao()));
        
    }
    
}
