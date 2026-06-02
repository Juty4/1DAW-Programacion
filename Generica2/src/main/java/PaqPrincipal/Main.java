package PaqPrincipal;

import Clases.*;

public class Main {

    static void main()
    {
    SubClaseGenerica<Integer> n=new SubClaseGenerica<>(56,47);

    SubClaseGenerica<String> s= new SubClaseGenerica<>("Texto",49);

    if(n instanceof SubClaseGenerica<Integer>) {
        System.out.println("es un numero");
    }




        }
    }
}
