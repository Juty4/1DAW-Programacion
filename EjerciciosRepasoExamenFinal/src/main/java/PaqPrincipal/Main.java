package PaqPrincipal;
import PaqEjercicio1.*;
import java.util.*;


public class Main {
    static void main()
    {
        ProPlayer participante1 = new ProPlayer();
        ProPlayer participante2 = new ProPlayer("ChacheWarden",32,7322,54043.32,"LigaDeTontos");
        Amateur participante3 = new Amateur();
        Amateur participante4 = new Amateur("GerNig",18,34,3);

        ArrayList<Participante> participantes = new ArrayList<Participante>();

        participantes.add(participante1);
        participantes.add(participante2);
        participantes.add(participante3);
        participantes.add(participante4);
        int horasTotales = 0;
        for (int i = 0;i < participantes.size(); i++)
                {
                   horasTotales += participantes.get(i).getHorasJugadas();

                }


        System.out.println(horasTotales);

    TreeSet<String> nombresP = new TreeSet<>();

    for (Participante n: participantes)
    {
        nombresP.add(n.getNickname());
    }
    for (String nombreP: nombresP)
        {
            System.out.println(nombreP);
        }



    HashMap<Integer,ProPlayer> proPlayers = new HashMap<>();

        proPlayers.put(((int)(Math.random() * 1000)),participante1);
        proPlayers.put(((int)(Math.random() * 1000)),participante2);

        for (Integer n: proPlayers.keySet())
        {
            System.out.println(n);
        }




//        System.out.println(participante1.toString());
//        System.out.println(participante2.toString());
//        System.out.println(participante3.toString());
//        System.out.println(participante4.toString());
//        System.out.println(participante5.toString());
//        System.out.println(participante6.toString());





    }
}
