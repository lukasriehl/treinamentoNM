/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Lukas
 */
public class TestaContains {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        long tempo = TestaContains.contains(arrayList);
        System.out.println(" ArrayList : " + tempo + " ms ");
        tempo = TestaContains.contains(hashSet);
        System.out.println(" HashSet : " + tempo + " ms ");
    }

    public static long contains(Collection colecao) {
        int size = 100000;
        for (int i = 0; i < size; i++) {
            colecao.add(i);
        }
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            colecao.contains(i);
        }
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }

}
