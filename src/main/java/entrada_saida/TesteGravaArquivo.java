/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada_saida;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lukas
 */
public class TesteGravaArquivo {

    public static void main(String[] args) {
        FileOutputStream arquivo;
        PrintStream printStream;
        Scanner scanner;
        String linha;

        try {
            arquivo = new FileOutputStream("/home/nm/NetBeansProjects/treinamentoNM/src/main/java/entrada_saida/saida2.txt");
            printStream = new PrintStream(arquivo);

            scanner = new Scanner(System.in);
            do {
                linha = scanner.nextLine();

                if (!linha.isEmpty()) {
                    printStream.println(linha);
                }
            } while (!linha.equals("SAIR"));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeituraDeArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
