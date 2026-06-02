package PaqClases;

public class Profesor extends Persona{
    private int anyos_trabajo;
    private String especialidad;
    private double sueldo;

    public Profesor(){
        this.anyos_trabajo = 0;
        this.especialidad = "";
        this.sueldo = 0;
    }

    public Profesor(String dni, String nombre, String apellido1, String apellido2, String direccion,int anyos_trabajo, String especialidad, double sueldo){
        super(dni,nombre,apellido1,apellido2,direccion);
        this.anyos_trabajo = anyos_trabajo;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public Profesor(Profesor p){
        super(p.getDni(), p.getNombre(), p.getApellido1(), p.getApellido2(), p.getDireccion());
        this.anyos_trabajo = p.anyos_trabajo;
        this.especialidad = p.especialidad;
        this.sueldo = p.sueldo;
    }

    public int getAnyos_trabajo() {
        return anyos_trabajo;
    }

    public void setAnyos_trabajo(int anyos_trabajo) {
        this.anyos_trabajo = anyos_trabajo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAÑOS DE TRABAJO: " + this.anyos_trabajo
                + "\nESPECIALIDAD: " + this.especialidad
                + "\nSUELDO: " + this.sueldo;
    }
}
