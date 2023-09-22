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
public class App {
    public static void main(String[] args) {
        int engordurado=0;
        int medio=0;
        int baixo=0;
        
        PratosSujosFactory pf = new PratosSujosFactory();
        
        for (int i = 0; i < 1000000; i++) {
            Prato p = pf.entregaPrato();
            //System.out.println(p.getNumSerie() + " - " + p.getSujeira());
            if (p.getSujeira() == nivelSujeira.BAIXO){
                baixo++;
            } else if(p.getSujeira() == nivelSujeira.MEDIO){
              medio++;  
            } else if(p.getSujeira() == nivelSujeira.ENGORDURADO){
                engordurado++;
            }
        }
        
        System.out.println("Engor: " + engordurado);
        System.out.println("Medio: " + medio);
        System.out.println("baixo: " + baixo);
        
        
        
        
    }
}
