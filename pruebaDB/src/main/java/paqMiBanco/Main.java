package paqMiBanco;

import paqOperaciones.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url = null;
        Crear crear = new Crear();
        Altas alta = new Altas();
        Bajas baja = new Bajas();
        Modificar modificar = new Modificar();
        Consultar consultar = new Consultar();
        Listado listado = new Listado();
        Connection conexion = null;

        try {
            url = "jdbc:mysql://127.0.0.1:3306/DataBank";
            conexion = DriverManager.getConnection(url, "root", "1234");
            System.out.println("Conexión OK");
            Scanner scanner = new Scanner(System.in);
            System.out.println("0.- Opción para crear las anteriores tablas en la base de datos de MYSQL.");
            System.out.println("1.- Alta Banco (Creará un nuevo banco leyendo por teclado sus atributos");
            System.out.println("2.- Alta Sucursal (Creará unna nueva sucursal de un banco ya existente");
            System.out.println("3.- Alta Cuenta (Creará una nueva cuenta en una sucursal de un banco existentes");
            System.out.println("4.- Alta Movimiento (añadirá un nuevo movimiento realizado sobre una cuenta");
            System.out.println("5.- Baja Banco");
            System.out.println("6.- Baja Sucursal");
            System.out.println("7.- Baja Cuenta");
            System.out.println("8.- Baja Movimiento");
            System.out.println("9.- Modificar Banco");
            System.out.println("10.- Modificar Sucursal");
            System.out.println("11.- Modificar Cuenta");
            System.out.println("12.- Modificar Movimiento");
            System.out.println("13.- Consultar Banco");
            System.out.println("14.- Consultar Sucursal");
            System.out.println("15.- Consultar Cuenta");
            System.out.println("16.- Consultar Movimiento");
            System.out.println("17.- Listado Banco");
            System.out.println("18.- Listado Sucursal");
            System.out.println("19.- Listado Cuenta");
            System.out.println("20.- Listado Movimiento");
            System.out.println("21. SALIR.");
            int n = scanner.nextInt();
            switch(n) {
                case 0:
                    crear.CreateTable(conexion);
                    break;
                case 1:
                    alta.altaBanco(conexion);
                    break;
                case 2:
                    alta.altaSucursal(conexion);
                    break;
                case 3:
                    alta.altaCuenta(conexion);
                    break;
                case 4:
                    alta.altaMovimiento(conexion);
                    break;
                case 5:
                    baja.bajaBanco(conexion);
                    break;
                case 6:
                    baja.bajaSucursal(conexion);
                    break;
                case 7:
                    baja.bajaCuenta(conexion);
                    break;
                case 8:
                    baja.bajaMovimiento(conexion);
                    break;
                case 9:
                    modificar.modificarBanco(conexion);
                    break;
                case 10:
                    modificar.modificarSucursal(conexion);
                    break;
                case 11:
                    modificar.modificarCuenta(conexion);
                    break;
                case 12:
                    modificar.modificarMovimiento(conexion);
                    break;
                case 13:
                    consultar.consultarBanco(conexion);
                    break;
                case 14:
                    consultar.consultarSucursal(conexion);
                    break;
                case 15:
                    consultar.consultarCuenta(conexion);
                    break;
                case 16:
                    consultar.consultarMovimiento(conexion);
                    break;
                case 17:
                    listado.listarBancos(conexion);
                    break;
                case 18:
                    listado.listarSucursales(conexion);
                    break;
                case 19:
                    listado.listarCuentas(conexion);
                    break;
                case 20:
                    listado.listarMovimientos(conexion);
                    break;
                case 21:
                    break;
            }

        } catch (SQLException e) {
            System.out.println("Error conexión" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error General");
        }
    }
}
