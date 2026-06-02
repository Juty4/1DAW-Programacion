package PaqClases;

import java.util.Date;

public class Videojuego extends Producto
{
    private String desarrollador;
    private String plataforma;
    private Date fechaLanzamiento;

    public Videojuego() {
        super();
        this.desarrollador = "";
        this.plataforma = "";
        this.fechaLanzamiento = new Date();
    }

    public Videojuego(Integer Identificador, Double Precio, String nombre,
                      String desarrollador, String plataforma, Date fechaLanzamiento) {
        super(Identificador, Precio, nombre);
        this.desarrollador = desarrollador;
        this.plataforma = plataforma;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public String toString() {
        return (super.toString() + " | Videojuego{" +
                "desarrollador='" + desarrollador + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                '}');
    }
}
