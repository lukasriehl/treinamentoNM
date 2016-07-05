/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_abstratas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lukas
 */
public class ContaPoupanca extends Conta {

    private int diaDoAniversario;
    
    @Override
    public void imprimeExtratoDetalhado(){
        System.out.println("EXTRATO DETALHADO DE CONTA POUPANÇA");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();
        
        System.out.println("DATA: " + sdf.format(agora));
        System.out.println("SALDO: " + String.valueOf(this.getSaldo()));
        System.out.println("ANIVERSÁRIO: " + String.valueOf(this.diaDoAniversario));
    }

    public int getDiaDoAniversario() {
        return diaDoAniversario;
    }

    public void setDiaDoAniversario(int diaDoAniversario) {
        this.diaDoAniversario = diaDoAniversario;
    }

}
