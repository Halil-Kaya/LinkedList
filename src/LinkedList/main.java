/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author minter
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> liste=new LinkedList<>();
        liste.addLast(6);
        liste.addLast(9);
        liste.addLast(2);
        liste.addFirst(0);
        
        
        liste.print();
        
        liste.addAfter(6,7);
        liste.addBefore(9, 33);
        
        
        liste.print();
        
        liste.remove(7);
        liste.remove(33);
        liste.remove(2);
        liste.remove(0);
        liste.remove(9);
        liste.remove(6);
        
        
        liste.print();
        
    }
    
}
