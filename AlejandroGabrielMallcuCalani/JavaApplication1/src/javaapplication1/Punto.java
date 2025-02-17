/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author USUARIO
 */
import java.lang.Math;

class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] coordCartesianas() {
        return new double[]{x, y};
    }

    public double[] coordPolares() {
        double r = Math.sqrt(x*x + y*y);
        double theta = Math.atan2(y, x);
        return new double[]{r, theta};
    }

    @Override
    public String toString() {
        return "Punto(" + x + ", " + y + ")";
    }
    }
