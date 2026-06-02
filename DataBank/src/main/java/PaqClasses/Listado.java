package paqOperaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Listado {
    public Listado(){
        Listado listado = new Listado();
    }

    public void listarBancos(Connection c){
        String consulta = "SELECT * FROM BANK";

        try{
            PreparedStatement sentencia = c.prepareStatement(consulta);
            System.out.println(sentencia.executeUpdate());

            System.out.println("Listado bancos realizado.");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }

    public void listarSucursales(Connection c){
        String consulta = "SELECT * FROM BRANCH";

        try{
            PreparedStatement sentencia = c.prepareStatement(consulta);
            System.out.println(sentencia.executeUpdate());

            System.out.println("Listado sucursales realizado.");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }

    }

    public void listarCuentas(Connection c){
        String consulta = "SELECT * FROM account";

        try{
            PreparedStatement sentencia = c.prepareStatement(consulta);
            System.out.println(sentencia.executeUpdate());

            System.out.println("Listado cuentas realizado.");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }

    public void listarMovimientos(Connection c){
        String consulta = "SELECT * FROM movement";
        try{
            PreparedStatement sentencia = c.prepareStatement(consulta);
            System.out.println(sentencia.executeUpdate());

            System.out.println("Listado movimientos realizado.");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }

    }

}
