/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author Lukas
 */
public class Secretaria extends Funcionario {
    
    private int ramal;
    
    @Override
    public void mostraDados() {
        System.out.println("SECRETÁRIA");
        super.mostraDados();
        System.out.println("Ramal: " + String.valueOf(this.ramal));
    }
    
    public int getRamal() {
        return ramal;
    }
    
    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
}
