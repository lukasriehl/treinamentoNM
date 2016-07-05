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
public class Telefonista extends Funcionario {

    private int estacaoDeTrabalho;

    @Override
    public void mostraDados() {
        System.out.println("TELEFONISTA");
        super.mostraDados();
        System.out.println("Estação de trabalho: " + String.valueOf(estacaoDeTrabalho));
    }

    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }

    public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }

}
