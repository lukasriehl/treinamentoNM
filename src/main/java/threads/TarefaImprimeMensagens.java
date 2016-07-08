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
public class TarefaImprimeMensagens implements Runnable {

    private String msg;

    public TarefaImprimeMensagens(String msg) {
        this.msg = msg;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(i + " : " + this.msg);
            if (i % 1000 == 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }

}
