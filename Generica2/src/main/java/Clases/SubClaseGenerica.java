package Clases;

public class SubClaseGenerica<T> extends ClaseNoGenerica
{
    T objeto;

    public SubClaseGenerica(T objeto, int num)
    {
        super(num);
        this.objeto = objeto;
    }

    public T getObjeto()
    {
        return objeto;
    }

}
