package PaqPrincipal;

public class Platano extends Fruta
{

    private boolean banana;

    public Platano()
    {
        super();
        this.banana = banana;
    }

    public Platano(String color, double peso, double precio, boolean banana) {
        super(color, peso, precio);
        this.banana = banana;
    }

    public void setBanana(boolean banana) {
        this.banana = banana;
    }

    public boolean getBanana() {
        return banana;
    }

    @Override
    public String toString() {
        return "Platano{" +
                "banana=" + banana +
                '}';
    }
}


