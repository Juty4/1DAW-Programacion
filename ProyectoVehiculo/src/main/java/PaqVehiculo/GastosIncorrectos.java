package PaqVehiculo;

public class GastosIncorrectos extends IllegalArgumentException
{
    public GastosIncorrectos()
    {
        super("Los gastos son incorrectos");
    }
    public GastosIncorrectos(String mensaje)
    {
        super(mensaje);
    }
}

