package PaqClases;

public class Producto
{
    private Integer Identificador;
    private Double Precio;
    private String nombre;

    public Producto(){
        this.Identificador = 0;
        this.Precio = 0.0;
        this.nombre = "";
    }
    public Producto(Integer Identificador, Double Precio, String nombre)
        {
        this.Identificador = Identificador;
        this.Precio = Precio;
        this.nombre = nombre;

        }

    public Integer getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(Integer identificador) {
        Identificador = identificador;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return ("Identificador: " + this.Identificador + ", Precio: " + this.Precio + ", Nombre: " + this.nombre);
    }

}
