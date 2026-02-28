package PaqVehiculo;
import PaqFecha.Fecha;

import java.util.Objects;

public class Vehiculo
{
    private String modelo;
    private int precio;
    private Fecha fechaCompra;

    public Vehiculo()
    {
       setVehiculo();
    }

    public Vehiculo(String modelo, int precio, int d, int m, int a)
    {
        setVehiculo(modelo, precio, d, m, a);
    }

    public Vehiculo(String modelo, int precio, Fecha fecha)
    {
        setVehiculo(modelo, precio, fecha);
    }

    public void setPrecio(int precio) {
        if (precio < 0)
            throw new PrecioIncorrecto();
        this.precio = precio;
    }
    public int getPrecio()
    {
        return precio;
    }
    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public Fecha getFechaCompra()
    {
        return fechaCompra;
    }

    public void setFechaCompra(Fecha fechaCompra)
    {
        this.fechaCompra = fechaCompra;
    }
    public Vehiculo setVehiculo()
    {
        Vehiculo v = new Vehiculo();
        v.modelo = "";
        v.precio = 0;
        v.fechaCompra = new Fecha();
        return v;
    }
    public Vehiculo setVehiculo(String modelo, int precio, int d, int m, int a)
    {
        Vehiculo v = new Vehiculo();
        Fecha fecha = new Fecha(d,m,a);

        v.setPrecio(precio);
        v.setModelo(modelo);
        v.setFechaCompra(fecha);
        return v;
    }
    public Vehiculo setVehiculo(String modelo, int precio, Fecha fecha)
    {
        Vehiculo v = new Vehiculo();

        v.setPrecio(precio);
        v.setModelo(modelo);
        v.setFechaCompra(fecha);
        return v;
    }

    @Override
    public String toString() {
        return "Vehiculo: " +
                "modelo='" + modelo +
                ", precio=" + precio +
                ", fechaCompra=" + fechaCompra;
    }

    public boolean equals(Vehiculo v)
    {
        return (this.modelo == v.modelo && this.precio == v.precio && this.fechaCompra == v.fechaCompra);
    }

}



