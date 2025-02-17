/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author USUARIO
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p = new Punto(3, 4);
        System.out.println("Coordenadas Cartesianas: (" + p.coordCartesianas()[0] + ", " + p.coordCartesianas()[1] + ")");
        System.out.println("Coordenadas Polares: (r = " + p.coordPolares()[0] + ", theta = " + p.coordPolares()[1] + ")");
        System.out.println(p);
    }
    
}
