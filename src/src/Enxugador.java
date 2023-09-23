/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import static src.App.done;

/**
 *
 * @author aluno
 */
public class Enxugador implements Runnable{
    private Escorredor escorredor;

    public Enxugador(Escorredor escorredor) {
        this.escorredor = escorredor;
    }

    @Override
    public void run() {
        Random r = new Random();
        
        while (!done) {
            try {
                Thread.sleep(r.nextInt(3, 10000));
            } catch (InterruptedException ex) {}
            
            escorredor.retirarPrato();
            System.out.println("Secado Prato");
        }
    }
    
    
    
    
}
