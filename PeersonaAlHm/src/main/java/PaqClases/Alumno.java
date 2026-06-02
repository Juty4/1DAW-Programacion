package PaqClases;

public class Alumno extends Persona{
    private String curso;
    private String nivel_ingles;

    public Alumno(){
        super();
        this.curso = "";
        this.nivel_ingles = "";
    }

    public Alumno(String dni, String nombre, String apellido1, String apellido2, String direccion,String curso, String nivel_ingles){
        super(dni,nombre,apellido1,apellido2,direccion);
        this.curso = curso;
        this.nivel_ingles = nivel_ingles;
    }

    public Alumno(Alumno alumno){
        super(alumno.getDni(), alumno.getNombre(), alumno.getApellido1(), alumno.getApellido2(), alumno.getDireccion());
        this.curso = alumno.curso;
        this.nivel_ingles = alumno.nivel_ingles;
    }

    @Override
    public String toString() {
        return super.toString() + "\n CURSO: " + this.curso
                + "\nNIVEL INGLÉS: " + this.nivel_ingles;
    }
}
