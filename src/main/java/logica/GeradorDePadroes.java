/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author Lukas
 */
public class GeradorDePadroes {

    public static void main(String[] args) {

        int opcao = 1;
        String valorTela;
        Scanner scanner = new Scanner(System.in);

        while (opcao != 0) {

            System.out.println("Escolha uma opção (1 a 5, 0 para sair):");
            System.out.println("1 - Padrão 1");
            System.out.println("2 - Padrão 2");
            System.out.println("3 - Triângulo");
            System.out.println("4 - Triângulos");
            System.out.println("5 - Fibonacci");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha: ");

            valorTela = scanner.nextLine();
            opcao = Integer.parseInt(valorTela);

            switch (opcao) {
                case 1:
                    ImprimePadrao1.main(args);
                    break;
                case 2:
                    ImprimePadrao2.main(args);
                    break;
                case 3:
                    imprimeTriangulo();
                    break;
                case 4:
                    imprimeTriangulos();
                    break;
                case 5:
                    imprimeFibonacci();
                default:
                    break;
            }

        }

    }

    private static void imprimeTriangulo() {
        //imprime 10 linhas
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void imprimeTriangulos() {
        int aux = 1;
        //Imprime 3 triângulos
        while (aux <= 12) {
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            aux += 4;
        }
    }

    private static void imprimeFibonacci() {
        int valor = 0, valorAnt = 0;
        String resultado = "";

        //Imprime os 30 primeiros números da sequência de Fibonacci
        for (int i = 0; i < 30; i++) {
            if (i == 1) {
                valor = 1;
                valorAnt = 0;
            } else {
                valor = valor + valorAnt;
                valorAnt = valor - valorAnt;
            }
            resultado = i < 29 ? (resultado + String.valueOf(valor) + ", ") : (resultado + String.valueOf(valor));

        }

        System.out.println("Resultado = " + resultado);
    }

}
