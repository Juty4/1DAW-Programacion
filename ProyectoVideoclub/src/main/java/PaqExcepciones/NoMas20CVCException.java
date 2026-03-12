package PaqExcepciones;

public class NoMas20CVCException extends IllegalArgumentException
{

    public NoMas20CVCException()
    {
        super("Error, el Video Club no puede tener más de 20 clientes");
    }

    public NoMas20CVCException(String message)
    {
        super(message);
    }
}
