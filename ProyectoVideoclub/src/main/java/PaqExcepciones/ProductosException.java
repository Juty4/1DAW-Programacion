package PaqExcepciones;

public class ProductosException extends IllegalArgumentException
{
    public ProductosException()
    {
        super();
    }

    public ProductosException(String message)
    {
        super(message);
    }

}
