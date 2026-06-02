package PaqPrincipal;
import java.util.*;
import PaqClases.*;
public class Main {

    static void main()
    {
        ArrayList<Persona> personas = new ArrayList<>();

        Persona per1 = new Persona("11111111A","Paco","Perez","Morales","Calle inventada 1");
        Persona per2 = new Persona("11111111B","Fulgencia","Vidal","Martinez","Calle inventada 2");
        personas.add(per1);
        personas.add(per2);

        Alumno alu1 = new Alumno("87654321C","Marco","Cañal","Moreno","Calle inventada 3","4ºESO","B2");;
        Alumno alu2 = new Alumno("12345678D","Karen","Lopez","Lopez","Calle inventada 4","2ºESO","C2");;
        personas.add(alu1);
        personas.add(alu2);

        Profesor prof1 = new Profesor("22222222J","Darwin","Waterson","de la Concepcion","Calle inventada 5",4,"Fisioterapeuta",3000.34);
        Profesor prof2 = new Profesor("55555555R","Ben","Tenison","Ramirez","Calle inventada 6",43,"Deportes",300.34);
        personas.add(prof1);
        personas.add(prof2);



    }
}
