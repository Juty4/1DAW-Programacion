package PaqClases;

import java.util.HashMap;

public class Sueldos
{


    public Integer sumarsueldo (HashMap<String,Integer> hm){
        Integer suma = new Integer(0);
        for (Integer n: hm.values())
        {
        suma += n;
        }
        return suma;
    }
}
