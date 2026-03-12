package PaqInterfaces;

import PaqExcepciones.AlquilarException;

public interface Alquilable
{
    public void alquilar() throws AlquilarException;
    public void devolver();
    public boolean isAlquilado();
}
