package PaqClases;

import PaqExcepciones.AlquilarException;
import PaqInterfaces.Alquilable;
import PaqInterfaces.Retirable;

public abstract class Producto implements Alquilable,Retirable
{
    private int id;
    private String nombre;
    private double precio;
    private static int contProductos;
    private boolean alquilado = false;
    private boolean retirado = false;


    public Producto(String nombre)
    {

        this.nombre = nombre;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        this.precio = precio;
    }

    public static int getContProductos() {
        return contProductos;
    }

    public static void setContProductos(int contProductos) {
        Producto.contProductos = contProductos;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public boolean isRetirado() {
        return retirado;
    }

    public void setRetirado(boolean retirado) {
        this.retirado = retirado;
    }

    public void alquilar()
    {
        throw new AlquilarException();

    }
    public void devolver()
    {
        this.alquilado = false;
    }
    public boolean isAlquilado()
    {
        return(this.alquilado);
    }




}
