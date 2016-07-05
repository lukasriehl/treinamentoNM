/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Lukas
 */
public class Ordena {

    public static void main(String[] args) {

        java.util.Arrays.sort(args);

        for (String arg : args) {
            System.out.println(arg);
        }
    }

}
