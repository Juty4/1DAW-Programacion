package PaqProyectoCoche;

class Coche
{
    private String marca;
    private String modelo;
    private String color;
    private String combustible;
    private String cambio;
    private int numPuertas;
    private int precio;

    public Coche()
    {
        this.marca = "Ferrari";
        this.modelo = "";
        this.color = "BLANCO";
        this.combustible = "GASOLINA";
        this.cambio = "MANUAL";
        this.numPuertas = 3;
        this.precio = 0;
    }
    public Coche(String marca,String modelo,String color,String combustible,String cambio,int numPuertas,int precio)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        this.cambio = cambio;
        this.numPuertas = numPuertas;
        this.precio = precio;
    }
    public Coche(Coche c2)
    {
        this.marca = c2.marca;
        this.modelo = c2.modelo;
        this.color = c2.color;
        this.combustible = c2.combustible;
        this.cambio = c2.cambio;
        this.numPuertas = c2.numPuertas;
        this.precio = c2.precio;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        try{
            if (numPuertas == 3 | numPuertas == 4 | numPuertas == 5)
            this.numPuertas = numPuertas;
        }catch (IllegalArgumentException e){ System.out.printf("Error al introducir puertas");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        try{
            if (combustible.toUpperCase() == "DIESEL" || combustible.toUpperCase() == "GASOLINA")
                this.combustible = combustible;
        }catch (IllegalArgumentException e){
            System.out.printf("Error al introducir combustible");
        }
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        try{
            if (cambio.toUpperCase() == "MANUAL" || cambio.toUpperCase() == "AUTOMATICO")
                this.cambio = cambio;
        }catch (IllegalArgumentException e){
            System.out.printf("Error al introducir cambio");
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", combustible='" + combustible + '\'' +
                ", cambio='" + cambio + '\'' +
                ", numPuertas=" + numPuertas +
                ", precio=" + precio +
                '}';
    }
}