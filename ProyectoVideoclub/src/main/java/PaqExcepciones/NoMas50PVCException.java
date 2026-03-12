package PaqExcepciones;

public class NoMas50PVCException extends IllegalArgumentException
{

    public NoMas50PVCException()
    {
        super("Error, el Video Club no puede tener más de 50 productos");
    }

    public NoMas50PVCException(String message)
    {
        super(message);
    }
}
