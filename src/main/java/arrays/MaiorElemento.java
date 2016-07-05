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
public class MaiorElemento {
    
    public static void main(String[] args) {
        
        Double maiorElemento = 0.0;
        Double valorElemento;
        
        for (String arg : args) {
            valorElemento = Double.parseDouble(arg);
            maiorElemento = valorElemento > maiorElemento ? valorElemento : maiorElemento;
        }
        
        System.out.println("O maior elemento é = " + String.valueOf(maiorElemento));
        
    }
    
}
