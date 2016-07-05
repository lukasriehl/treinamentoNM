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
public class Gerente extends Funcionario {

    private String usuario;
    private String senha;

    @Override
    public double calculaBonificacao() {
        return this.getSalario() * 0.6 + 100;
    }

    @Override
    public void mostraDados() {
        System.out.println("GERENTE");
        super.mostraDados();
        System.out.println("Usuário: " + this.usuario);
        System.out.println("Senha: " + this.senha);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
