/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada_saida;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lukas
 */
public class EscritaDeArquivo {

    public static void main(String[] args) {
        try {
            FileOutputStream arquivo = new FileOutputStream("saida.txt");
            PrintStream printStream = new PrintStream(arquivo);

            printStream.println("Primeira linha");
            printStream.println("Segunda linha");
            printStream.println("Terceira linha");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeituraDeArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
