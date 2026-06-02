package PaqClases;

import java.util.Date;

public class CD extends Producto
{
    private String artista;
    private Integer numeroPistas;
    private Date fechaLanzamiento;

    public CD() {
        super();
        this.artista = "";
        this.numeroPistas = 0;
        this.fechaLanzamiento = new Date();
    }

    public CD(Integer Identificador, Double Precio, String nombre,
              String artista, Integer numeroPistas, Date fechaLanzamiento) {
        super(Identificador, Precio, nombre);
        this.artista = artista;
        this.numeroPistas = numeroPistas;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getNumeroPistas() {
        return numeroPistas;
    }

    public void setNumeroPistas(Integer numeroPistas) {
        this.numeroPistas = numeroPistas;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public String toString() {
        return (super.toString() + " | CD{" +
                "artista='" + artista + '\'' +
                ", numeroPistas=" + numeroPistas +
                ", fechaLanzamiento=" + fechaLanzamiento +
                '}');
    }
}
