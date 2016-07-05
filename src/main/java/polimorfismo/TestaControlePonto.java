/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Lukas
 */
public class TestaControlePonto {

    public static void main(String[] args) {
        ControleDePonto controleDePonto = new ControleDePonto();

        Gerente g = new Gerente();
        g.setCodigo(123);

        System.out.println("Dados do ponto do gerente");
        System.out.println("Código: " + String.valueOf(g.getCodigo()));
        controleDePonto.registrarEntrada(g);
        controleDePonto.registrarSaida(g);

        Telefonista t = new Telefonista();
        t.setCodigo(1234);

        System.out.println("\nDados do ponto da telefonista");
        System.out.println("Código: " + String.valueOf(t.getCodigo()));
        controleDePonto.registrarEntrada(t);
        controleDePonto.registrarSaida(t);

    }

}
