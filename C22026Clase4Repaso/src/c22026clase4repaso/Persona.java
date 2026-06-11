/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22026clase4repaso;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Persona {
    // esta clase lo que hace es matricular y llevar el registro un estudiante universitario.

    public int id;
    public String name;
    //public int edad;

    public Carrera carrera5;
    public Carrera carrera4;
    public Carrera carrera3;
    public Carrera carrera2;
    public Carrera carrera1;

    public void matricular() {
        JOptionPane.showMessageDialog(null, "El estudiante si matriculo");

    }

    public double calculaPromedio() {
        double curso1 = 90;
        double curso2 = 70;

        return (curso1 + curso2) / 2;
    }

    public double calculaPromedioAletorio() {
        Random aleotorio = new Random();
        double curso1 = aleotorio.nextDouble(100);
        double curso2 = aleotorio.nextDouble(100);
        JOptionPane.showMessageDialog(null, "Curso1 " + curso1 + "\n"
                + "Curso2 " + curso2);
        System.out.println("este codigo solo lo ve el desarrollador");
        return (curso1 + curso2) / 2;
    }

    /**
     * Este Metodo realiza calculos con la edad dependiendo de ella
     *
     * @param edad recibe la edad verdadera
     * @return la mentira
     */
    public int retornaEdadMentira(int edad) {
        int resultado = 0;
        if (edad < 18) {
            resultado = 18;
        } else if (edad > 18 && edad < 25) {
            resultado = edad + 3;
        } else if (edad > 40) {
            resultado = edad - 6;
        }
        return resultado;
    }

    public int retornaEdadMentira(int edad, boolean imprime) {
        int resultado = 0;
        if (edad < 18) {
            resultado = 18;
        } else if (edad > 18 && edad < 25) {
            resultado = edad + 3;
        } else if (edad > 40) {
            resultado = edad - 6;
        }
        if (imprime) {
            JOptionPane.showMessageDialog(null, "Mi edad correcta es " + edad + "\n"
                    + "Mi edad mentira es " + resultado);
        }

        return resultado;
    }

}
