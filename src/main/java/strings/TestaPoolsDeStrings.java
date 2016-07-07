/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author lukas
 */
public class TestaPoolsDeStrings {
    
    public static void main(String[] args) {
        
        String nome1 = "Lukas Riehl";
        String nome2 = "Lukas Riehl";
        
        System.out.println(nome1 == nome2);
        
        System.out.println(nome1.equals(nome2));
        
        String nome3 = new String("Lukas Riehl");
        String nome4 = new String("Lukas Riehl");
        
        System.out.println(nome3 == nome4);
        
        System.out.println(nome3.equals(nome4));
    }
    
}
