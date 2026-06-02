package paqOperaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crear {
    String script = "-- 1. Crear la base de datos\n" +
            "CREATE DATABASE DataBank;\n" +
            "\n" +
            "-- 2. Seleccionar la base de datos para empezar a crear las tablas en ella\n" +
            "USE DataBank;\n" +
            "\n" +
            "-- 3. Crear las tablas en orden (respetando las claves foráneas)\n" +
            "CREATE TABLE bank (\n" +
            "    cod_banco INT PRIMARY KEY, \n" +
            "    nf_banco VARCHAR(10), \n" +
            "    nombre_banc VARCHAR(30), \n" +
            "    dom_fiscal VARCHAR(35), \n" +
            "    poblacion VARCHAR(35)\n" +
            ");\n" +
            "\n" +
            "CREATE TABLE branch (\n" +
            "    cod_banco INT, \n" +
            "    cod_sucur INT, \n" +
            "    nombre_suc VARCHAR(35), \n" +
            "    loc_suc VARCHAR(35), \n" +
            "    prov_suc VARCHAR(35), \n" +
            "    PRIMARY KEY(cod_banco, cod_sucur), \n" +
            "    FOREIGN KEY (cod_banco) REFERENCES bank(cod_banco) ON UPDATE CASCADE ON DELETE CASCADE\n" +
            ");\n" +
            "\n" +
            "CREATE TABLE account (\n" +
            "    cod_banco INT, \n" +
            "    cod_sucur INT, \n" +
            "    num_cta INT, \n" +
            "    dni_dueño VARCHAR(9), \n" +
            "    saldo DOUBLE, \n" +
            "    PRIMARY KEY(cod_banco, cod_sucur, num_cta), \n" +
            "    FOREIGN KEY (cod_banco) REFERENCES bank(cod_banco), \n" +
            "    FOREIGN KEY (cod_banco, cod_sucur) REFERENCES branch(cod_banco, cod_sucur) ON UPDATE CASCADE ON DELETE CASCADE\n" +
            ");\n" +
            "\n" +
            "CREATE TABLE movement (\n" +
            "    num_operac INT PRIMARY KEY, \n" +
            "    cod_banco INT, \n" +
            "    cod_sucur INT, \n" +
            "    num_cta INT, \n" +
            "    FECHA VARCHAR(10), \n" +
            "    cantidad DOUBLE, \n" +
            "    tipo_operac VARCHAR(20), \n" +
            "    observacion VARCHAR(50), \n" +
            "    FOREIGN KEY (cod_banco, cod_sucur, num_cta) REFERENCES account(cod_banco, cod_sucur, num_cta) ON UPDATE CASCADE ON DELETE CASCADE\n" +
            ");";
    public void CreateTable(Connection c){
        try{
            PreparedStatement sentencia = c.prepareStatement(script);
            sentencia.execute();
            System.out.println("Tabla creada");
        }
        catch (SQLException e){
            System.out.println("Error en operación de inserción SQL");
        } catch (Exception e) {
            System.out.println("Error general");
        }

    }
}
