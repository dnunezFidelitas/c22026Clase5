/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22026clase4repaso;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C22026Clase4Repaso {

    
    public static int nextValue=0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Vamos a crear una carrera y dos estudiantes y luego vamos matricular
        Carrera informatica = new Carrera();
        informatica.code="INFO001";
        informatica.name="Informatica";
        informatica.accredited=true;
        
        Persona pepito=new Persona();
        Persona gabi=new Persona();
        nextValue++;
        pepito.id=nextValue;
        pepito.name= "Juan Carlos Zamora";
        pepito.carrera1=informatica;
        
        nextValue++;
        gabi.id=nextValue;
        gabi.name= "Gabriela Socorro";
        gabi.carrera1=informatica;
        
        
        JOptionPane.showMessageDialog(null, pepito.name 
                + " " + pepito.id 
                + " " + pepito.carrera1.name);
        JOptionPane.showMessageDialog(null, gabi.name 
                + " " + gabi.id 
                + " " + gabi.carrera1.name);
        
        String variable=retornaUnString();
        JOptionPane.showMessageDialog(null, variable);
        
        JOptionPane.showMessageDialog(null, retornaUnString());
       
        JOptionPane.showMessageDialog(null,pepito.calculaPromedio());
        JOptionPane.showMessageDialog(null,pepito.calculaPromedioAletorio());
        
        //pepito.edad=15;
        //gabi.edad=43;
        JOptionPane.showMessageDialog(null, pepito.retornaEdadMentira(15));
        JOptionPane.showMessageDialog(null, pepito.retornaEdadMentira(43));
        
        pepito.retornaEdadMentira(23, true);
        
        
        Curso sc299 = new Curso();
        sc299.id="sc299";
        sc299.name="Curso Maldito";
        sc299.quantity=20;
        //sc299.infoPrivate() esto da error pq es privado
        sc299.printInfo();
        
    }
    
    
    public static String retornaUnString(){
        return "Esto devuelve un valor alphanumerico";
    }
    
}
