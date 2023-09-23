/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author aluno
 */
public class App {
    
    public static boolean done = false;
    
    public static void aguardar(long milis) {
		try {
			Thread.sleep(milis);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
    
    public static void work(){
        
    }
    
    public static void stop(){
        done = true;
    }
    
    public static void main(String[] args) {    
        
        
        
    }
}
