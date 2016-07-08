/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada_saida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lukas
 */
public class TesteLeEGravaArquivo {

    public static void main(String[] args) {
        InputStream arquivo = null;
        FileOutputStream arquivoSaida;
        PrintStream printStream;
        try {
            arquivo = new FileInputStream("/home/nm/NetBeansProjects/treinamentoNM/src/main/java/entrada_saida/entrada.txt");
            arquivoSaida = new FileOutputStream("/home/nm/NetBeansProjects/treinamentoNM/src/main/java/entrada_saida/saida.txt");
            printStream = new PrintStream(arquivoSaida);

            Scanner scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                printStream.println(linha);
                System.out.println(linha);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeituraDeArquivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                arquivo.close();
            } catch (IOException ex) {
                Logger.getLogger(LeituraDeArquivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
