package PaqClases;

import PaqInterfaces.VENDIBLE;
import PaqExcepciones.PrecioExcepciones;

abstract public class PRODUCTO implements VENDIBLE
{
    private String nombre;
    private double precio;
    public PRODUCTO()
    {
        this.nombre = "NULL";
        this.precio = 0.00;
    }
    public PRODUCTO(String nombre, double precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0)
            this.precio = precio;
        else
            throw new PrecioExcepciones();
    }

    @Override
    public String toString() {
        return "PRODUCTO{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
