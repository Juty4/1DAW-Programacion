package paqOperaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Modificar {
    public Modificar(){
        Modificar modificar = new Modificar();
    }

    public void modificarBanco(Connection c){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("COD BANCO?:");
        int cod_banco = keyboard.nextInt();
        String update = "UPDATE bank SET nf_banco = ?, nombre_banc = ?, dom_fiscal = ?, poblacion = ?" +
                "WHERE cod_banco=" + cod_banco;

        System.out.println("NF BANCO?:");
        String nf_banco = keyboard.next();

        System.out.println("NOMBRE BANCO?");
        String nombre_banc = keyboard.next();

        System.out.println("DOMINIO FISCAL?");
        String dom_fiscal = keyboard.next();

        System.out.println("POBLACIÓN? ");
        String poblacion = keyboard.next();

        try{
            PreparedStatement sentencia = c.prepareStatement(update);
            sentencia.setInt(1, cod_banco);
            sentencia.setString(2, nf_banco);
            sentencia.setString(3, nombre_banc);
            sentencia.setString(4, dom_fiscal);
            sentencia.setString(5, poblacion);
            sentencia.execute();

            System.out.println("Actualización realizada");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }

    public void modificarSucursal(Connection c) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("COD SUCURSAL?:");
        int cod_sucur = keyboard.nextInt();
        String update = "UPDATE branch SET cod_banco = ?, nombre_suc = ?, loc_suc = ?, prov_suc = ?" +
                "WHERE cod_sucur=" + cod_sucur;

        System.out.println("COD BANCO?:");
        int cod_banco = keyboard.nextInt();

        System.out.println("NOMBRE SUCURSAL?");
        String nombre_suc = keyboard.next();

        System.out.println("LOCALIZACIÓN SUCURSAL?");
        String loc_suc = keyboard.next();

        System.out.println("PROVINCIA SUCURSAL? ");
        String prov_suc = keyboard.next();

        try {
            PreparedStatement sentencia = c.prepareStatement(update);
            sentencia.setInt(1, cod_banco);
            sentencia.setString(2, nombre_suc);
            sentencia.setString(3, loc_suc);
            sentencia.setString(4, prov_suc);
            sentencia.execute();

            System.out.println("Actualización realizada");
        } catch (SQLException e) {
            System.out.println("Error en operación de inserción SQL");
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }

        public void modificarCuenta(Connection c){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("NUMERO CUENTA?");
            int num_cta = keyboard.nextInt();
            String insert = "UPDATE account SET cod_banco=?, cod_sucur=?, dni_dueno=?, saldo=? WHERE num_cta = " + num_cta;

            System.out.println("COD BANCO?:");
            int cod_banco = keyboard.nextInt();

            System.out.println("COD SUCURSAL?:");
            int cod_sucur = keyboard.nextInt();

            System.out.println("DNI DUEÑO");
            String dni_dueno = keyboard.next();

            System.out.println("SALDO? ");
            double saldo = keyboard.nextDouble();

            try{
                PreparedStatement sentencia = c.prepareStatement(insert);
                sentencia.setInt(1, cod_banco);
                sentencia.setInt(2, cod_sucur);
                sentencia.setString(3, dni_dueno);
                sentencia.setDouble(4, saldo);
                sentencia.execute();

                System.out.println("Actualización realizada");
            }
            catch (SQLException e){
                System.out.println("Error en operación de inserción SQL");
            } catch (Exception e) {
                System.out.println("Error general");
            }
        }

    public void modificarMovimiento(Connection c){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("NUM OPERACIÓN?:");
        int num_operac = keyboard.nextInt();

        String update = "UPDATE movement SET cod_banco=?, cod_sucur=?, num_cta=?, FECHA=?, cantidad=?,tipo_operac=?, observacion=? WHERE num_operac = " + num_operac;

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
            PreparedStatement sentencia = c.prepareStatement(update);
            sentencia.setInt(1, cod_banco);
            sentencia.setInt(2, cod_sucur);
            sentencia.setInt(3, num_cta);
            sentencia.setString(4, fecha);
            sentencia.setDouble(5, cantidad);
            sentencia.setString(6, tipo_operac);
            sentencia.setString(7, observacion);
            sentencia.execute();

            System.out.println("Actualización realizada");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL");
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }
}
