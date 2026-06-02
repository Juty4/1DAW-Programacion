package Clases;

public class CGenerica<T,V> extends AGenerica<T>
{
    V objeto;

    public CGenerica(T objeto1,V objeto2)
    {
        super(objeto1);
        this.objeto = objeto2;
    }

    public T getT()
    {
       return getObjeto();
    }
    public V getV()
    {
        return this.objeto;
    }


}
