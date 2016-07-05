/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Lukas
 */
public class ImprimePadrao2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0) {
                System.out.println("PI");
            } else {
                System.out.println(String.valueOf(i));
            }
        }
    }

}
