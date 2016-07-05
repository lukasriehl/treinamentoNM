/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lukas
 */
public class ControleDePonto {

    public void registrarEntrada(Funcionario f) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("ENTRADA: " + String.valueOf(f.getCodigo()));
        System.out.println("DATA: " + sdf.format(agora));
    }

    public void registrarSaida(Funcionario f) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("SAÍDA: " + String.valueOf(f.getCodigo()));
        System.out.println("DATA: " + sdf.format(agora));
    }

}
