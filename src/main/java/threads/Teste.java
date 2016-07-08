/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Lukas
 */
public class Teste {

    public static void main(String[] args) {
        TarefaImprimeMensagens t1 = new TarefaImprimeMensagens("K19");
        TarefaImprimeMensagens t2 = new TarefaImprimeMensagens("Java");
        TarefaImprimeMensagens t3 = new TarefaImprimeMensagens("Web");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
