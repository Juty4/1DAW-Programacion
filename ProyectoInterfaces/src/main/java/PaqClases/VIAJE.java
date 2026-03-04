package PaqClases;

import PaqInterfaces.VENDIBLE;

public class VIAJE implements VENDIBLE
{
    private String origen;
    private String destino;
    private int ndias;
    private double precio;
    private static final double precioiva = 0.21;

    public VIAJE()
    {
        this.origen = "NULL";
        this.destino = "NULL";
        this.ndias = 0;
        this.precio = 0.00;
    }

    public VIAJE(String origen, String destino, int ndias, double precio) {
        this.origen = origen;
        this.destino = destino;
        this.ndias = ndias;
        this.precio = precio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNdias() {
        return ndias;
    }

    public void setNdias(int ndias) {
        this.ndias = ndias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecioiva()
    {
        return precioiva;
    }

    @Override
    public double precioiva()
    {
        return (getPrecio() * precioiva);
    }
}
