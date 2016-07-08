/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada_saida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lukas
 */
public class LeituraDeArquivo {

    public static void main(String[] args) {
        InputStream arquivo = null;
        try {
            arquivo = new FileInputStream("/home/nm/NetBeansProjects/treinamentoNM/src/main/java/entrada_saida/entrada.txt");
            Scanner scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
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
