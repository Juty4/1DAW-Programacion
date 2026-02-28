package PaqVehiculo;

public class KmsIncorrectos extends IllegalArgumentException
{
    public KmsIncorrectos()
    {
        super("Los Kms son incorrectos");
    }
    public KmsIncorrectos(String mensaje)
    {
        super(mensaje);
    }
}
