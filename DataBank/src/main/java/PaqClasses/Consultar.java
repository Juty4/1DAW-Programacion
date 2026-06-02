package paqOperaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Consultar {
    public Consultar(){
        Consultar consultar = new Consultar();
    }

    public void consultarBanco(Connection c){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("CÓDIGO DEL BANCO A CONSULTAR:");
        int id = keyboard.nextInt();
        String consulta = "SELECT * FROM BANK WHERE cod_banco = " + id;

        try{
            PreparedStatement sentencia = c.prepareStatement(consulta);
            System.out.println(sentencia.executeUpdate());

            System.out.println("Banco consultado.");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }

    }

    public void consultarSucursal(Connection c){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("CÓDIGO DE LA SUCURSAL A CONSULTAR:");
        int id = keyboard.nextInt();
        String consulta = "SELECT * FROM branch WHERE cod_sucur = " + id;

        try{
            PreparedStatement sentencia = c.prepareStatement(consulta);
            System.out.println(sentencia.executeUpdate());

            System.out.println("Sucursal consultada.");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }

    }

    public void consultarCuenta(Connection c){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("CÓDIGO DE LA CUENTA A CONSULTAR:");
        int id = keyboard.nextInt();
        String consulta = "SELECT * FROM account WHERE num_cta = " + id;

        try{
            PreparedStatement sentencia = c.prepareStatement(consulta);
            System.out.println(sentencia.executeUpdate());

            System.out.println("Cuenta consultada.");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }

    }

    public void consultarMovimiento(Connection c){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("CÓDIGO DEL MOVIMIENTO A CONSULTAR:");
        int id = keyboard.nextInt();
        String consulta = "SELECT * FROM movement WHERE num_operac = " + id;

        try{
            PreparedStatement sentencia = c.prepareStatement(consulta);
            System.out.println(sentencia.executeUpdate());

            System.out.println("Operación consultada.");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }

    }

}
