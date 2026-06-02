package Clases;

public class AGenerica<T>
{
    T objeto;

    public AGenerica(T objeto)
    {
        this.objeto = objeto;
    }

    public T getObjeto()
    {
        return objeto;
    }

    public void setObjeto(T objeto)
    {
        this.objeto = objeto;
    }
}

