package PaqClases;
import java.util.Date;
public class Pelicula extends Producto
{
    private Date fechaPublicacion;
    private String director;

    public Pelicula(){
        super();
        this.fechaPublicacion = new Date();
        this.director = "";
    }

    public Pelicula(Integer Identificador, Double Precio, String nombre,Date fechaPublicacion, String director){
        super(Identificador,Precio,nombre);
        this.fechaPublicacion = fechaPublicacion;
        this.director = director;
    }


    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return ( super.toString() + "Pelicula{" +
                "fechaPublicacion=" + fechaPublicacion +
                ", director='" + director + '\'' +
                '}');
    }
}
