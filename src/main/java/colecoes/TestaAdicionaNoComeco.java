/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lukas
 */
public class TestaAdicionaNoComeco {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        long tempo = TestaAdicionaNoComeco.adicionaNoComeco(arrayList);
        System.out.println(" ArrayList : " + tempo + " ms ");
        tempo = TestaAdicionaNoComeco.adicionaNoComeco(linkedList);
        System.out.println(" LinkedList : " + tempo + " ms ");
    }

    public static long adicionaNoComeco(List lista) {
        long inicio = System.currentTimeMillis();
        int size = 100000;
        for (int i = 0; i < size; i++) {
            lista.add(0, i);
        }
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }

}
