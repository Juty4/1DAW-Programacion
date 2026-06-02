package PaqPrincipal;
import java.io.*;
import java.util.Scanner;
import PaqClases.*;

public class Main {
    public static void lecturaEstandar(){
        StringBuilder str = new StringBuilder();

        char c;


        try{
            while ((c = (char) System.in.read()) != '\n') {
                str.append(c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Cadena introducida: " + str);
    }

    public static void copiarFichero(String origen, String destino){
       try{
           OutputStream fsalida;

           InputStream fentrada = new FileInputStream(origen);

           try {
            fsalida = new FileOutputStream(destino);

            byte[] buffer = new byte[256];

            while (true) {
                int n = fentrada.read(buffer);

                if (n < 0)
                    break;
                fsalida.write(buffer,0,n);
            }
            fsalida.close();
            fentrada.close();

        }
           catch(IOException ex){
               System.out.println("Error en el fichero: " + ex.getMessage());
           }
       }
       catch(IOException ex){
           System.out.println("Error en el fichero: " + ex.getMessage());
       }
       catch(Exception ex){
           System.out.println("Error general");
       }
    }


    static void main()
    {
    Persona elena = new Persona("Elena",21);

        System.out.printf(elena.toString());

        try{
            FileOutputStream fos = new FileOutputStream("/Users/juty/Downloads/hola.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(elena);

            oos.close();
            fos.close();

            System.out.println("Objeto serializado");


            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream("/Users/juty/Downloads/hola.txt")
                    );

            Persona p = (Persona)in.readObject();
            in.close();

            System.out.printf("______________________________");
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());
        }
        catch(Exception ex){
            System.out.printf("Error");
        }


    }
}
