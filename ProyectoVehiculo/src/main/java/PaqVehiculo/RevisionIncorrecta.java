package PaqVehiculo;

public class RevisionIncorrecta extends IllegalArgumentException
{
    public RevisionIncorrecta()
    {
        super("");
    }
    public RevisionIncorrecta(String mensaje)
    {
        super(mensaje);
    }
}
