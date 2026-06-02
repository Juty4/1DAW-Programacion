package paqOperaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Bajas {
    public Bajas(){
    }

    public void bajaBanco(Connection c){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("CÓDIGO DEL BANCO A ELIMINAR:");
        int id = keyboard.nextInt();
        String delete = "DELETE FROM bank WHERE cod_banco =" + id;
        System.out.println(delete);

        try{
            PreparedStatement sentencia = c.prepareStatement(delete);
            System.out.println(sentencia.executeUpdate());

            System.out.println("Banco eliminado.");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }

    public void bajaSucursal(Connection c){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("CÓDIGO DEL BANCO A ELIMINAR:");
        int id = keyboard.nextInt();
        String delete = "DELETE FROM bank WHERE cod_banco =" + id;
        System.out.println(delete);

        try{
            PreparedStatement sentencia = c.prepareStatement(delete);
            System.out.println(sentencia.executeUpdate());

            System.out.println("Sucursal eliminada.");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }

    public void bajaCuenta(Connection c){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("CÓDIGO DEL BANCO A ELIMINAR:");
        int id = keyboard.nextInt();
        String delete = "DELETE FROM account WHERE cod_banco =" + id;
        System.out.println(delete);

        try{
            PreparedStatement sentencia = c.prepareStatement(delete);
            System.out.println(sentencia.executeUpdate());

            System.out.println("Cuenta eliminada.");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }

    public void bajaMovimiento(Connection c){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("NÚMERO OPERACIÓN A ELIMINAR:");
        int id = keyboard.nextInt();
        System.out.println("");
        String delete = "DELETE FROM movement WHERE num_operac =" + id;
        System.out.println(delete);

        try{
            PreparedStatement sentencia = c.prepareStatement(delete);
            System.out.println(sentencia.executeUpdate());

            System.out.println("Movimiento eliminado.");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }
}
