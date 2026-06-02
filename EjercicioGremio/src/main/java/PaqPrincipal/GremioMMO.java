package PaqPrincipal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 1. Creamos el objeto base
class Jugador
{
    private int id;
    private String nombre;
    private String rol;

    public Jugador(int id, String nombre, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getRol() { return rol; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Rol: " + rol;
    }
}

public class GremioMMO {
    public static void main(String[] args) {

        // --- AQUÍ ESTÁ LA MAGIA DE LAS COLECCIONES ---

        // List: Importa el orden. Registro de quién entró primero.
        ArrayList<Jugador> historialGremio = new ArrayList<>();

        // Set: No admite repetidos. Solo queremos saber qué roles tenemos disponibles.
        HashSet<String> rolesUnicos = new HashSet<>();

        // Map: Diccionario. Clave (ID del jugador) -> Valor (El objeto Jugador entero)
        HashMap<Integer, Jugador> buscadorJugadores = new HashMap<>();

        // 2. Creamos a los notas
        Jugador j1 = new Jugador(101, "Baity", "Tanque");
        Jugador j2 = new Jugador(102, "DarkSlayer99", "DPS");
        Jugador j3 = new Jugador(103, "xX_Healer_Xx", "Healer");
        Jugador j4 = new Jugador(104, "Paco", "DPS"); // Otro DPS para comprobar duplicados

        // 3. Los metemos en el ArrayList (Historial)
        historialGremio.add(j1);
        historialGremio.add(j2);
        historialGremio.add(j3);
        historialGremio.add(j4);

        // 4. Los metemos en el Map (Buscador instantáneo)
        for (Jugador j : historialGremio) {
            buscadorJugadores.put(j.getId(), j);
            // De paso, rellenamos el Set con los roles
            rolesUnicos.add(j.getRol());
        }

        // --- HORA DE VER CÓMO ESCUPE LOS DATOS ---

        System.out.println("=== HISTORIAL DE ENTRADA (ArrayList) ===");
        // Recorremos con un for-each genérico
        for (Jugador j : historialGremio) {
            System.out.println(j.getNombre() + " se unió al gremio.");
        }

        System.out.println("\n=== ROLES DISPONIBLES PARA RAID (HashSet) ===");
        // Como es un Set, "DPS" solo saldrá una vez aunque haya dos jugadores DPS
        for (String rol : rolesUnicos) {
            System.out.println("- " + rol);
        }

        System.out.println("\n=== BÚSQUEDA DIRECTA POR ID (HashMap) ===");
        // Buscamos el ID 103 directamente sin recorrer toda la lista. Rapidísimo.
        int idBuscado = 103;
        if (buscadorJugadores.containsKey(idBuscado)) {
            System.out.println("Jugador encontrado al instante: " + buscadorJugadores.get(idBuscado).toString());
        } else {
            System.out.println("Ese ID no existe, máquina.");
        }
    }
}