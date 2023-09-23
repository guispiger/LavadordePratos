/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author aluno
 */
public class Lavador implements Runnable {

    private final Escorredor escorredor;
    private final PratosSujosFactory factory;
    private Boolean done;

    public Lavador(Escorredor escorredor, PratosSujosFactory factory) {
        this.escorredor = escorredor;
        this.factory = factory;
    }

    public void done() {
        this.done = true;
    }

    @Override
    public void run() {
        done = false;
        while (!done) {
            Prato p = factory.entregaPrato();
            long tempo = 0;
            if (null == p.getSujeira()) {
                tempo = 10;
            } else switch (p.getSujeira()) {
                case BAIXO:
                    tempo = 3;
                    break;
                case MEDIO:
                    tempo = 5;
                    break;
                default:
                    tempo = 10;
                    break;
            }

            try {
                synchronized (escorredor) {
                    while (escorredor.getPratos().size() == escorredor.getMax()) {
                        try {
                            escorredor.wait();
                        } catch (InterruptedException ex) {
                        }
                    }
                    Thread.sleep(tempo);
                    escorredor.colocarPrato(p);
                    escorredor.notifyAll();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

    }

}
