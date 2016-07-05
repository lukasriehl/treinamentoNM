/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author Lukas
 */
public class Funcionario {
    
    private String nome;
    private double salario;
    
    public double calculaBonificacao() {
        return this.salario * 0.1;
    }
    
    public void mostraDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + String.valueOf(this.salario));
        System.out.println("Bonificação: " + String.valueOf(calculaBonificacao()));
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
