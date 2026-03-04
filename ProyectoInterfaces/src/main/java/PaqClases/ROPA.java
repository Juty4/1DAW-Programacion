package PaqClases;

public class ROPA extends PRODUCTO
{
    private static final double precioiva = 0.1;

    public ROPA()
    {
        super();
    }
    public ROPA(String nombre, double precio)
    {
        this.setNombre(nombre);
        this.setPrecio(precio);
    }

    public double precioiva()
    {
        return (getPrecio() * precioiva);
    }

    public double getIva()
    {
        return precioiva;
    }

    @Override
    public String toString()
    {
        return super.toString() + "ALIMENTACION{" +
                "precioiva=" + precioiva +
                '}';
    }

}
