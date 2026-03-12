package PaqExcepciones;

public class IdiomaPeliculaException extends IllegalArgumentException
{
    public IdiomaPeliculaException()
    {
        super("Error, el idioma de una Película no está definido");
    }

    public IdiomaPeliculaException(String message)
    {
        super(message);
    }


}
