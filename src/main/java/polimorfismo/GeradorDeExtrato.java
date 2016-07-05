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
public class GeradorDeExtrato {

    public void imprimeExtratoBasico(Conta c) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("DATA: " + sdf.format(agora));
        System.out.println("SALDO: " + c.getSaldo());

    }

}
