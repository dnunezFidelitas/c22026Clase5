/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22026clase4repaso;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Curso {
    public String id;
    public String name;
    public int quantity;
    private int avgAprove;
    
    
    public void printInfo(){
        JOptionPane.showMessageDialog(null, "Id " + id + "\n" +
                                             "name " + name + "\n" +
                                             "quantity " + quantity + "\n" 
                                             );
        System.out.println("avgAprove " + avgAprove);
    
    }
    
    private void infoPrivate(){
        JOptionPane.showMessageDialog(null, "Id " + id + "\n" +
                                             "name " + name + "\n" +
                                             "quantity " + quantity + "\n" +
                                             "avgAprove " + avgAprove + "\n");
    }
    
    
    
}
