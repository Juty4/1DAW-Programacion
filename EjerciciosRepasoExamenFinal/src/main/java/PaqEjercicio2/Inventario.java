package PaqEjercicio2;

import java.util.ArrayList;

public class Inventario<T extends ObjetoJuego>
{

    public ArrayList<T> arrayGenerico;


    public void aniadir(T elemento){
        arrayGenerico.add(elemento);
    }

    public boolean estaVacio(){
        if (arrayGenerico.size() == 0)
            return true;
        else
            return false;
    }

    public T extraerUltimo(){
        return arrayGenerico.getLast();
    }



}
