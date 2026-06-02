package paqOperaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Altas {
    public Altas() {
    }

    public void altaBanco(Connection c){
        String insert = "INSERT INTO bank VALUES(?, ?, ?, ?, ?)";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("COD BANCO?:");
        int cod_banco = keyboard.nextInt();

        System.out.println("NF BANCO?:");
        String nf_banco = keyboard.next();

        System.out.println("NOMBRE BANCO?");
        String nombre_banc = keyboard.next();

        System.out.println("DOMINIO FISCAL?");
        String dom_fiscal = keyboard.next();

        System.out.println("POBLACIÓN? ");
        String poblacion = keyboard.next();

        try{
            PreparedStatement sentencia = c.prepareStatement(insert);
            sentencia.setInt(1, cod_banco);
            sentencia.setString(2, nf_banco);
            sentencia.setString(3, nombre_banc);
            sentencia.setString(4, dom_fiscal);
            sentencia.setString(5, poblacion);
            sentencia.execute();

            System.out.println("Inserción realizada");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }

    public void altaSucursal(Connection c){
        String insert = "INSERT INTO branch VALUES(?, ?, ?, ?, ?)";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("COD BANCO?:");
        int cod_banco = keyboard.nextInt();

        System.out.println("COD SUCURSAL?:");
        int cod_sucur = keyboard.nextInt();

        System.out.println("NOMBRE SUCURSAL?");
        String nombre_suc = keyboard.next();

        System.out.println("LOCALIZACIÓN SUCURSAL?");
        String loc_suc = keyboard.next();

        System.out.println("PROVINCIA SUCURSAL? ");
        String prov_suc = keyboard.next();

        try{
            PreparedStatement sentencia = c.prepareStatement(insert);
            sentencia.setInt(1, cod_banco);
            sentencia.setInt(2, cod_sucur);
            sentencia.setString(3, nombre_suc);
            sentencia.setString(4, loc_suc);
            sentencia.setString(5, prov_suc);
            sentencia.execute();

            System.out.println("Inserción realizada");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL");
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }

    public void altaCuenta(Connection c){
        String insert = "INSERT INTO account VALUES(?, ?, ?, ?, ?)";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("COD BANCO?:");
        int cod_banco = keyboard.nextInt();

        System.out.println("COD SUCURSAL?:");
        int cod_sucur = keyboard.nextInt();

        System.out.println("NUMERO CUENTA?");
        int num_cta = keyboard.nextInt();

        System.out.println("DNI DUEÑO");
        String dni_dueno = keyboard.next();

        System.out.println("SALDO? ");
        double saldo = keyboard.nextDouble();

        try{
            PreparedStatement sentencia = c.prepareStatement(insert);
            sentencia.setInt(1, cod_banco);
            sentencia.setInt(2, cod_sucur);
            sentencia.setInt(3, num_cta);
            sentencia.setString(4, dni_dueno);
            sentencia.setDouble(5, saldo);
            sentencia.execute();

            System.out.println("Inserción realizada");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL");
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }

    public void altaMovimiento(Connection c){
        String insert = "INSERT INTO movement VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("NUM OPERACIÓN?:");
        int num_operac = keyboard.nextInt();

        System.out.println("COD BANCO?:");
        int cod_banco = keyboard.nextInt();

        System.out.println("COD SUCURSAL?");
        int cod_sucur = keyboard.nextInt();

        System.out.println("NUMERO CUENTA?");
        int num_cta = keyboard.nextInt();

        System.out.println("FECHA? ");
        String fecha = keyboard.next();

        System.out.println("CANTIDAD? ");
        double cantidad = keyboard.nextDouble();

        System.out.println("TIPO OPERACIÓN? ");
        String tipo_operac = keyboard.next();

        System.out.println("OBSERVACIÓN? ");
        String observacion = keyboard.next();


        try{
            PreparedStatement sentencia = c.prepareStatement(insert);
            sentencia.setInt(1, num_operac);
            sentencia.setInt(2, cod_banco);
            sentencia.setInt(3, cod_sucur);
            sentencia.setInt(4, num_cta);
            sentencia.setString(5, fecha);
            sentencia.setDouble(6, cantidad);
            sentencia.setString(7, tipo_operac);
            sentencia.setString(8, observacion);
            sentencia.execute();

            System.out.println("Inserción realizada");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL");
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }
}
