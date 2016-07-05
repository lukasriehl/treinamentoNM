/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacao_a_objetos;

import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class TestaFuncionario2 {

    public static void main(String[] args) {
        int opcao = 1;
        Funcionario f = new Funcionario();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Insira o nome do funcionário:");
            f.nome = scanner.nextLine();

            System.out.println("Insira o salário:");
            f.salario = scanner.nextDouble();

            f.consultarDados();

            System.out.println("Digite 1 para alterar os dados");
            opcao = scanner.nextInt();
            scanner.nextLine();

        } while (opcao == 1);

    }

}
