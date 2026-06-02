package PaqPrincipal;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public int opcion;

    static void main()
    {

        Manzana man1 = new Manzana("Verde",0.5,1,"Golden");
        Manzana man2 = new Manzana("Amarilla",0.6,0.9,"SudTirol");
        Platano pla1 = new Platano("Canarias",0.3,1.1,false);

        Fruta frutas[] = new Fruta[3];

        frutas[0] = man1;
        frutas[1] = man2;
        frutas[2] = pla1;

        for (int i = 0; i < frutas.length; i++)
        {
            System.out.println(frutas[i].toString());
        }








    }
}
