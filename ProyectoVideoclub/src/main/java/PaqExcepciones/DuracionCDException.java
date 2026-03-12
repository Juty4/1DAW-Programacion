package PaqExcepciones;

public class DuracionCDException extends IllegalArgumentException
{
    public DuracionCDException()
    {
        super("Error, la duración de un CD no puede ser negativa o 0");
    }

    public DuracionCDException(String message)
    {
        super(message);
    }


}
