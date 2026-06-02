package PaqEjercicio3;

public class DataBase
{
    Conection conexion = null;
    try

    {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/DataEmpresa";
        conexion = DriverManager.getConnection(url, "root", "root");
        System.out.println("Conexion establecida");
    }catch(Exception e){
        e.printStackTrace();
}



}
