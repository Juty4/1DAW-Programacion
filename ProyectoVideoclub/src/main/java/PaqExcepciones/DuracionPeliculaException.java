package PaqExcepciones;

public class DuracionPeliculaException extends IllegalArgumentException
{
    public DuracionPeliculaException()
    {
        super("Error, la duración de una Pelicula no puede ser negativa o 0");
    }

    public DuracionPeliculaException(String message)
    {
        super(message);
    }

}
