/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Lukas
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 10000);

            Scanner entrada = new Scanner(socket.getInputStream());

            String linha = entrada.nextLine();

            System.out.println(linha);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
