package PaqExcepciones;

public class NoMas5PAPCException extends RuntimeException
{

    public NoMas5PAPCException()
    {
        super("Error, un cliente nunca puede alquilar más de 5 productos");
    }

    public NoMas5PAPCException(String message)
    {
        super(message);
    }
}
