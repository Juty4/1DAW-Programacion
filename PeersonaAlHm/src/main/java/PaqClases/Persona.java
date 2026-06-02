package PaqClases;
import java.util.Scanner;
public class Persona {
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private boolean por_teclado;
    Scanner scanner = new Scanner(System.in);
    public Persona(){
        this.por_teclado = true;
        System.out.println("DI EL DNI:");
        this.dni = scanner.next();
        this.nombre = "";
        this.apellido1 = "";
        this.apellido2 = "";
        this.direccion = "";
    }

    public Persona(String dni, String nombre, String apellido1, String apellido2, String direccion){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.por_teclado = false;
    }

    public Persona(Persona p){
        this.dni = p.dni;
        this.nombre = p.nombre;
        this.apellido1 = p.apellido1;
        this.apellido2 = p.apellido2;
        this.direccion = p.direccion;
        this.por_teclado = false;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean getPor_teclado(){
        return this.por_teclado;
    }

    @Override
    public String toString(){
        return "DNI: " + this.getDni()
                + "\nNOMBRE: " + this.getNombre()
                + "\nAPELLIDO 1: " + this.getApellido1()
                + "\nAPELLIDO 2: " + this.getApellido2()
                + "\nDIRECCIÓN: " + this.getDireccion();
    }


}
