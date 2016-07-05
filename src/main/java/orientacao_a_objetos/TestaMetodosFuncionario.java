/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacao_a_objetos;

/**
 *
 * @author lukas
 */
public class TestaMetodosFuncionario {
    
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        
        f1.nome = "Joao";
        f1.salario = 1500;
        
        f1.consultarDados();
        
        f1.aumentarSalario(100);
        
        f1.consultarDados();
    }
    
}
