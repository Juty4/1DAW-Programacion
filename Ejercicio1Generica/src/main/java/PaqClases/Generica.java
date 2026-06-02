package PaqClases;

import java.util.ArrayList;

public class Generica <T extends Producto>
{

    private ArrayList<T> productos;


    public Generica()
    {
        productos = new ArrayList<>();
    }
    public Generica (ArrayList<T> productos)
    {
        this.productos = productos;
    }

    public ArrayList<T> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<T> productos) {
        this.productos = productos;
    }

    public boolean estaVacia()
    {
        return productos.isEmpty();
    }

    public T primero()
    {
        if (!estaVacia())
            return productos.get(0);
        else{
            throw new IllegalArgumentException("La lista esta vacia");
        }
    }

    public T extraer()
    {
        T objeto = this.primero();
        if (estaVacia() == true)
        {
            throw new IllegalArgumentException("La lista esta vacia");
        }
        else
        {
            this.productos.remove(objeto);
            return objeto;
        }
    }

    @Override
    public String toString()
    {
        return productos.toString();
    }



}
