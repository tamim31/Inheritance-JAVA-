/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hierarchical.inheritance;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Two t1= new Two();
        t1.printTwo();
        t1.printOne();
        
        Three t2= new Three();
        t2.printThree();
        t2.printOne();
        
        Four t3=new Four();
        t3.printFour();
        t3.printOne();
        
    }
    
}
