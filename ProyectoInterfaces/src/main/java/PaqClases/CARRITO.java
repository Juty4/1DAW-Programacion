package PaqClases;

import PaqInterfaces.VENDIBLE;

public class CARRITO
{
    public VENDIBLE listacarrito[];
    public int num = 0;

    public CARRITO()
    {
        listacarrito = new VENDIBLE[5];
    }
    public void addCarrito(VENDIBLE v)
    {
        if (this.num < this.listacarrito.length)
            this.listacarrito[num++] = v;
        else
            System.out.printf("Carrito lleno no se pueden insertar más alimentos");
    }
    
}
