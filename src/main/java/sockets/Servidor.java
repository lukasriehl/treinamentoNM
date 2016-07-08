/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Lukas
 */
public class Servidor {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);

            Socket socket = serverSocket.accept();

            PrintStream saida = new PrintStream(socket.getOutputStream());

            saida.println("Você se conectou ao servidor do K19!");
        } catch (IOException e) {
            System.out.println("Erro ao criar o socket!");
        }
    }

}
