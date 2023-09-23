/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Enxugador implements Runnable {

    private final Escorredor escorredor;
    private Boolean done;

    public Enxugador(Escorredor escorredor) {
        this.escorredor = escorredor;
    }

    public void done() {
        this.done = true;
    }

    @Override
    public void run() {
        done = false;
        Random r = new Random();

        while (!done) {
            try {
                synchronized (escorredor) {
                    while (escorredor.getPratos().isEmpty()) {
                        try {
                            escorredor.wait();
                        } catch (InterruptedException ex) {
                        }
                    }
                    escorredor.retirarPrato();
                    Thread.sleep(r.nextInt(3, 11));
                    escorredor.notifyAll();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}
