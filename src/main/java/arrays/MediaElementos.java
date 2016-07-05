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
public class MediaElementos {

    public static void main(String[] args) {

        Double[] arrayElementos = new Double[args.length];
        Double valorElemento;
        Double somaElementos = 0.0;
        int indice = 0;

        for (String arg : args) {
            valorElemento = Double.parseDouble(arg);
            arrayElementos[indice] = valorElemento;
            somaElementos += valorElemento;
            indice++;
        }

        System.out.println("Média dos elementos = " + String.valueOf(somaElementos / indice));

    }

}
