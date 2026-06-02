package PaqPrincipal;

import java.security.Principal;
import java.util.Scanner;


public class Fruta implements Comparable {
    private String color;
    private double peso;
    private double precio;

    public Fruta() {
        this.color = "AZUL";
        this.peso = 1.00;
        this.precio = 1.00;
    }

    public Fruta(String color, double peso, double precio) {
        this.color = color;
        this.peso = peso;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "color='" + color + '\'' +
                ", peso=" + peso +
                ", precio=" + precio +
                '}';
    }

    @Override
    public int compareTo(Object f) {
        switch (Principal.opcion) {
            case 1:
                
                if (this.peso < ((Fruta) f).getPeso())
                    return -1;
                else
                    return 1;
        }
    }
}