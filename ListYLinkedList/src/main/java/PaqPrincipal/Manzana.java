package PaqPrincipal;

public class Manzana extends Fruta
{
    private String variedad;

    public Manzana()
    {
        this.variedad = "ROJA";
    }

    public Manzana(String color, double peso, double precio, String variedad) {
        super(color, peso, precio);
        this.variedad = variedad;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    @Override
    public String toString() {
        return "Manzana{" +
                "variedad='" + variedad + '\'' +
                '}';
    }
}
