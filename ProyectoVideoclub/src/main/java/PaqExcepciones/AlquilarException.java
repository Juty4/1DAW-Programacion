package PaqExcepciones;

public class AlquilarException extends IllegalArgumentException
{
    public AlquilarException()
    {
        super();
    }

    public AlquilarException(String message)
    {
        super(message);
    }
}
