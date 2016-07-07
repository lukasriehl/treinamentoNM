/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada_saida;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class LeituraDoTeclado {

    public static void main(String[] args) {
        InputStream teclado = System.in;
        Scanner scanner = new Scanner(teclado);

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
        }
    }

}
