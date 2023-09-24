package src;

import java.util.LinkedList;

/**
 *
 * @author guispiger
 */
public class Escorredor {
    private final int max = 10;
    LinkedList<Prato> pratos = new LinkedList<>();
    
    //Lavador chama
    public void colocarPrato(Prato p) throws Exception{
        if (pratos.size() >= max) {
            throw new RuntimeException("ESTOUROU O LIMITE MÁXIMO!!!");
        }
        pratos.addFirst(p);
        //System.out.println("Lavado Prato: " + p.getNumSerie() + "-" + p.getSujeira());
        this.status("LAVADOR: ");
    }
    
    //Enxugador chama
    public void retirarPrato() throws Exception{

        if (pratos.size() <= 0) {
            throw new RuntimeException("ESTOUROU O LIMITE MÍNIMO!!!");
        }
        Prato p = pratos.getLast();
        pratos.remove(p);
        //System.out.println("Secado Prato: " +  p.getNumSerie() + "-" + p.getSujeira());
        this.status("SECADOR: ");

    }
    
    public void status(String s){
        if (pratos.size() == max) {
            System.out.println( s + "Escorredor CHEIO - " + pratos.size() + " pratos!!!");
        } else if (pratos.size() == 0) {
            System.out.println( s + "Escorredor VAZIO - " + pratos.size() + " pratos!!!");
        }
    }

    public int getMax() {
        return max;
    }

    public LinkedList<Prato> getPratos() {
        return pratos;
    }
    
}
