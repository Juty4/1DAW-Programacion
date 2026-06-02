package PaqPrincipal;

import paqOperaciones.Altas;
import paqOperaciones.Bajas;
import paqOperaciones.Consultar;
import paqOperaciones.Crear;
import paqOperaciones.Listado;
import paqOperaciones.Modificar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    // ─── Configuración de conexión ────────────────────────────────────────────────
    private static final String URL      = "jdbc:mysql://localhost:3306/DataBank";
    private static final String USUARIO  = "root";
    private static final String PASSWORD = "";

    // ─── Conexión a MySQL ─────────────────────────────────────────────────────────
    public static Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("✔ Conexión establecida con la base de datos.");
        } catch (SQLException e) {
            System.out.println("✘ Error al conectar con la base de datos: " + e.getMessage());
        }
        return con;
    }

    // ─── Menú principal ───────────────────────────────────────────────────────────
    public static void mostrarMenu() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║           GESTIÓN BANCARIA - MENÚ            ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println("║  0.  Crear tablas en la base de datos        ║");
        System.out.println("╠──────────────────────────────────────────────╣");
        System.out.println("║  --- ALTAS ---                               ║");
        System.out.println("║  1.  Alta Banco                              ║");
        System.out.println("║  2.  Alta Sucursal                           ║");
        System.out.println("║  3.  Alta Cuenta                             ║");
        System.out.println("║  4.  Alta Movimiento                         ║");
        System.out.println("╠──────────────────────────────────────────────╣");
        System.out.println("║  --- BAJAS ---                               ║");
        System.out.println("║  5.  Baja Banco        (ON CASCADE)          ║");
        System.out.println("║  6.  Baja Sucursal     (ON CASCADE)          ║");
        System.out.println("║  7.  Baja Cuenta       (ON CASCADE)          ║");
        System.out.println("║  8.  Baja Movimiento   (ON CASCADE)          ║");
        System.out.println("╠──────────────────────────────────────────────╣");
        System.out.println("║  --- MODIFICACIONES ---                      ║");
        System.out.println("║  9.  Modificar Banco   (ON CASCADE)          ║");
        System.out.println("║  10. Modificar Sucursal                      ║");
        System.out.println("║  11. Modificar Cuenta                        ║");
        System.out.println("║  12. Modificar Movimiento                    ║");
        System.out.println("╠──────────────────────────────────────────────╣");
        System.out.println("║  --- CONSULTAS ---                           ║");
        System.out.println("║  13. Consultar Banco                         ║");
        System.out.println("║  14. Consultar Sucursal                      ║");
        System.out.println("║  15. Consultar Cuenta                        ║");
        System.out.println("║  16. Consultar Movimiento                    ║");
        System.out.println("╠──────────────────────────────────────────────╣");
        System.out.println("║  --- LISTADOS ---                            ║");
        System.out.println("║  17. Listado de Bancos                       ║");
        System.out.println("║  18. Listado de Sucursales de un banco       ║");
        System.out.println("║  19. Listado de Cuentas de un banco/sucursal ║");
        System.out.println("║  20. Listado de Movimientos                  ║");
        System.out.println("╠──────────────────────────────────────────────╣");
        System.out.println("║  21. SALIR                                   ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.print("Seleccione una opción: ");
    }

    // ─── main ─────────────────────────────────────────────────────────────────────
    public static void main(String[] args) {

        Connection con = conectar();

        // Si no hay conexión no tiene sentido continuar
        if (con == null) {
            System.out.println("No se puede continuar sin conexión a la base de datos. Saliendo...");
            return;
        }

        // Instancias de las clases de operaciones
        Crear     crear     = new Crear();
        Altas     altas     = new Altas();
        Bajas     bajas     = new Bajas();
        Modificar modificar = new Modificar();
        Consultar consultar = new Consultar();
        Listado   listado   = new Listado();

        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        do {
            mostrarMenu();

            try {
                opcion = sc.nextInt();
            } catch (Exception e) {
                System.out.println("✘ Opción no válida. Introduzca un número del 0 al 21.");
                sc.nextLine(); // limpiar buffer
                continue;
            }

            switch (opcion) {

                // ── 0: Crear tablas ──────────────────────────────────────────────
                case 0:
                    System.out.println("\n[ Opción 0 ] Creando tablas en MySQL...");
                    crear.CreateTable(con);
                    break;

                // ── ALTAS ────────────────────────────────────────────────────────
                case 1:
                    System.out.println("\n[ Opción 1 ] Alta Banco");
                    altas.altaBanco(con);
                    break;

                case 2:
                    System.out.println("\n[ Opción 2 ] Alta Sucursal");
                    altas.altaSucursal(con);
                    break;

                case 3:
                    System.out.println("\n[ Opción 3 ] Alta Cuenta");
                    altas.altaCuenta(con);
                    break;

                case 4:
                    System.out.println("\n[ Opción 4 ] Alta Movimiento");
                    altas.altaMovimiento(con);
                    break;

                // ── BAJAS ────────────────────────────────────────────────────────
                case 5:
                    System.out.println("\n[ Opción 5 ] Baja Banco (ON CASCADE: borra sucursales, cuentas y movimientos relacionados)");
                    bajas.bajaBanco(con);
                    break;

                case 6:
                    System.out.println("\n[ Opción 6 ] Baja Sucursal (ON CASCADE: borra cuentas y movimientos relacionados)");
                    bajas.bajaSucursal(con);
                    break;

                case 7:
                    System.out.println("\n[ Opción 7 ] Baja Cuenta (ON CASCADE: borra movimientos relacionados)");
                    bajas.bajaCuenta(con);
                    break;

                case 8:
                    System.out.println("\n[ Opción 8 ] Baja Movimiento");
                    bajas.bajaMovimiento(con);
                    break;

                // ── MODIFICACIONES ───────────────────────────────────────────────
                case 9:
                    System.out.println("\n[ Opción 9 ] Modificar Banco (ON CASCADE: actualiza sucursales y cuentas)");
                    modificar.modificarBanco(con);
                    break;

                case 10:
                    System.out.println("\n[ Opción 10 ] Modificar Sucursal");
                    modificar.modificarSucursal(con);
                    break;

                case 11:
                    System.out.println("\n[ Opción 11 ] Modificar Cuenta");
                    modificar.modificarCuenta(con);
                    break;

                case 12:
                    System.out.println("\n[ Opción 12 ] Modificar Movimiento");
                    modificar.modificarMovimiento(con);
                    break;

                // ── CONSULTAS ────────────────────────────────────────────────────
                case 13:
                    System.out.println("\n[ Opción 13 ] Consultar Banco (por clave)");
                    consultar.consultarBanco(con);
                    break;

                case 14:
                    System.out.println("\n[ Opción 14 ] Consultar Sucursal (por clave)");
                    consultar.consultarSucursal(con);
                    break;

                case 15:
                    System.out.println("\n[ Opción 15 ] Consultar Cuenta (por clave)");
                    consultar.consultarCuenta(con);
                    break;

                case 16:
                    System.out.println("\n[ Opción 16 ] Consultar Movimiento (por clave)");
                    consultar.consultarMovimiento(con);
                    break;

                // ── LISTADOS ─────────────────────────────────────────────────────
                case 17:
                    System.out.println("\n[ Opción 17 ] Listado de todos los Bancos");
                    listado.listarBancos(con);
                    break;

                case 18:
                    System.out.println("\n[ Opción 18 ] Listado de Sucursales de un banco");
                    listado.listarSucursales(con);
                    break;

                case 19:
                    System.out.println("\n[ Opción 19 ] Listado de Cuentas (banco / sucursal)");
                    listado.listarCuentas(con);
                    break;

                case 20:
                    System.out.println("\n[ Opción 20 ] Listado de Movimientos");
                    listado.listarMovimientos(con);
                    break;

                // ── SALIR ────────────────────────────────────────────────────────
                case 21:
                    System.out.println("\nCerrando conexión y saliendo del programa. ¡Hasta pronto!");
                    try {
                        con.close();
                    } catch (SQLException e) {
                        System.out.println("Error al cerrar la conexión: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("✘ Opción no válida. Introduzca un número del 0 al 21.");
            }

        } while (opcion != 21);

        sc.close();
    }
}