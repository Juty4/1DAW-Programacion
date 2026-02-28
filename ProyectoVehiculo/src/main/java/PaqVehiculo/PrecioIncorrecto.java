package PaqVehiculo;

class PrecioIncorrecto extends IllegalArgumentException
{
    public PrecioIncorrecto()
    {
        super("El precio es incorrecto");
    }
    public PrecioIncorrecto(String mensaje)
    {
        super(mensaje);
    }
}