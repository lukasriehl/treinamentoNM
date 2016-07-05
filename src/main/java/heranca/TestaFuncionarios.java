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
public class TestaFuncionarios {

    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setNome("José da Silva");
        g.setSalario(3000);
        g.setUsuario("jose.silva");
        g.setSenha("123");

        Telefonista t = new Telefonista();
        t.setNome("Maria");
        t.setSalario(1500);
        t.setEstacaoDeTrabalho(1);

        Secretaria s = new Secretaria();
        s.setNome("Joana");
        s.setSalario(2000);
        s.setRamal(100);

//        System.out.println("GERENTE");
//        System.out.println("Nome: " + g.getNome());
//        System.out.println("Salário: " + String.valueOf(g.getSalario()));
//        System.out.println("Usuário: " + g.getUsuario());
//        System.out.println("Senha: " + g.getSenha());
//        System.out.println("Bonificação: " + String.valueOf(g.calculaBonificacao()));
        g.mostraDados();

//        System.out.println("TELEFONISTA");
//        System.out.println("Nome: " + t.getNome());
//        System.out.println("Salário: " + String.valueOf(t.getSalario()));
//        System.out.println("Estação de trabalho: " + String.valueOf(t.getEstacaoDeTrabalho()));
//        System.out.println("Bonificação: " + String.valueOf(t.calculaBonificacao()));
        t.mostraDados();

//        System.out.println("SECRETÁRIA");
//        System.out.println("Nome: " + s.getNome());
//        System.out.println("Salário: " + String.valueOf(s.getSalario()));
//        System.out.println("Ramal: " + String.valueOf(s.getRamal()));
//        System.out.println("Bonificação: " + String.valueOf(s.calculaBonificacao()));
        s.mostraDados();

    }

}
