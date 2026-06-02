package PaqPrincipal;

import com.sun.source.tree.Tree;

import java.util.*;



public class Main {


    public static String tablaMultiplicar(Integer n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        String resultado = "";


        for (int i = 0; i < 10; i++)
        {
            hm.put(i,i*n);
        }

        for (int i = 0; i < hm.size(); i++)
        {
            resultado = resultado + "valor: " + i + " es " + hm.get(i);
        }
        return resultado;
    }


    public static void leerAlHm(ArrayList<HashMap <String,Integer> > lista)
    {
        HashMap<String, Integer> hm;
        for (int i = 0; i < lista.size(); i++)
        {
            System.out.println();
            System.out.println("Elemento: " + i + "__________________________");
            hm = lista.get(i);
            for (String llave : hm.keySet())
                {
                    Integer valor = hm.get(llave);
                System.out.println("DNI: " + llave + " valor: " + valor);
                }
        }

    }
    public static void leerAlTm(ArrayList<TreeMap <String,Integer> > lista)
    {
        TreeMap<String, Integer> tm;
        for (int i = 0; i < lista.size(); i++)
        {
            System.out.println();
            System.out.println("Elemento: " + i + "__________________________");
            tm = lista.get(i);
            for (String llave : tm.keySet())
            {
                Integer valor = tm.get(llave);
                System.out.println("DNI: " + llave + " valor: " + valor);
            }
        }

    }

    static void main()
    {
        String tabla = tablaMultiplicar(5);
        System.out.printf(tabla);



        ArrayList < HashMap <String,Integer> > alhm = new ArrayList < HashMap <String,Integer> > ();

        HashMap <String,Integer> hm1 = new HashMap <String,Integer>();
        HashMap <String,Integer> hm2 = new HashMap <String,Integer>();
        HashMap <String,Integer> hm3 = new HashMap <String,Integer>();
        hm1.put("11111111A",10000);
        alhm.add(hm1);
        hm2.put("11111111B",20000);
        hm2.put("11111111C",30000);
        alhm.add(hm2);
        hm3.put("11111111D",40000);
        alhm.add(hm3);

        leerAlHm(alhm);


        ArrayList < TreeMap <String,Integer> > altm = new ArrayList <TreeMap <String,Integer>> ();


        TreeMap <String,Integer> Tm1 = new TreeMap <String,Integer>();
        TreeMap <String,Integer> Tm2 = new TreeMap <String,Integer>();
        TreeMap <String,Integer> Tm3 = new TreeMap <String,Integer>();
        Tm1.put("11111111A",10000);
        altm.add(Tm1);
        Tm2.put("22222222B",20000);
        Tm2.put("33333333C",30000);
        altm.add(Tm2);
        Tm3.put("44444444D",40000);
        altm.add(Tm3);

        leerAlTm(altm);
    }
}
