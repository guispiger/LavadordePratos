/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.LinkedList;

/**
 *
 * @author aluno
 */
public class Escorredor {
    private int max = 10;
    LinkedList<Prato> pratos = new LinkedList<>();
    
    //Lavador chama
    public synchronized void colocarPrato(Prato p){
        while (pratos.size() == max) {            
            try {
                wait();
            } catch (InterruptedException ex) {
                
            }
        }
        notifyAll();
        pratos.addFirst(p);
    }
    
    //Enxugador chama
    public synchronized Prato retirarPrato(){
        while (pratos.size() == 0) {            
            try {
                wait();
            } catch (InterruptedException ex) {
                
            }
        }
        notifyAll();
        return pratos.getLast();
    }
    
}
