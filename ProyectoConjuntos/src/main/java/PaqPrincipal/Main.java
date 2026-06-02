package PaqPrincipal;

import PaqClases.Sueldos;

import java.util.HashMap;
import java.util.TreeMap;

public Integer sumarsueldo (HashMap<String,Integer> hm){
    Integer suma = new Integer(0);
    for (Integer n: hm.values())
    {
        suma += n;
    }
    return suma;
}

public class Main {
    static void main() {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

            hm.put("111111A", 10_000);
            hm.put("222222B", 20_000);
            hm.put("333333C", 30_000);
            hm.put("444444D", 40_000);

            hm.put("444444D", 80_000);


            for(String llave:hm.keySet()){
                Integer valor = hm.get(llave);
                System.out.println("Clave: " + llave + "    Valor: " + valor);
            }



        System.out.println((hm));
            System.out.println((hm));


    }
}
