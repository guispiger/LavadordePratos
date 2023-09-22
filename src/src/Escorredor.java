/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.LinkedList;
import src.Prato;

/**
 *
 * @author aluno
 */
public class Escorredor {
    private boolean full = false; 
    LinkedList<Prato> pratos = new LinkedList<>();
    private int cont = 1;
   
    
    
    /*public synchronized void add(){
        while (full) {            
            try {
                wait();
            } catch (InterruptedException ex) {
            }
            
            isFull();
            
            if(!full){
                pratos[cont] = new Prato();
                cont++;
            }

            notifyAll();
        }
    }
    
    public synchronized void remove(){
        while (!full) {            
            try {
                wait();
            } catch (InterruptedException ex) {
            }
            
            isFull();
            
            pratos[cont] = null;
            cont--;
            notifyAll();
        }
    }*/
    
    private void isFull(){
        if (cont == 10) {
            this.full = true;
        }
    }
   
    
    
}
