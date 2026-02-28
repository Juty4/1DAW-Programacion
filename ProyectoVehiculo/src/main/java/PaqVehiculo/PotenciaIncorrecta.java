package PaqVehiculo;

class PotenciaIncorrecta extends IllegalArgumentException
{
    public PotenciaIncorrecta()
    {
        super("La potencia es incorrecta");
    }

    public PotenciaIncorrecta(String mensaje)
    {
        super(mensaje);
    }
}
