/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.Random;

/**
 *
 * @author guispiger
 */
public class PratosSujosFactory {
    private static int i = 1;
    
    Random r = new Random();
    
    public Prato entregaPrato(){
        Prato p = new Prato();
        
        p.setNumSerie(i);
        i++;
        
        int x = r.nextInt(101);
        
        if(x < 10){
            p.setSujeira(nivelSujeira.ENGORDURADO);
        } else if (x >= 10 && x <= 70){
            p.setSujeira(nivelSujeira.MEDIO);
        } else if(x > 70) {
            p.setSujeira(nivelSujeira.BAIXO);
        }
        
        return p;
    }
    
}
