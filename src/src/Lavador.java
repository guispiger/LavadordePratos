/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import static src.App.done;

/**
 *
 * @author aluno
 */
public class Lavador implements Runnable{
    private Escorredor escorredor;
    private PratosSujosFactory factory;
    
    public Lavador(Escorredor escorredor, PratosSujosFactory factory){
        this.escorredor = escorredor;
        this.factory = factory;
    }

    @Override
    public void run() {
        
        while (!done) {
            Prato p = factory.entregaPrato();
            if(p.getSujeira() == nivelSujeira.BAIXO){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {}
            } else if (p.getSujeira() == nivelSujeira.MEDIO) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {}
            } else {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {}
            }
            
            escorredor.colocarPrato(p);
            System.out.println("Lavado Prato: " + p.getSujeira());
        }
    }
    
    
}
