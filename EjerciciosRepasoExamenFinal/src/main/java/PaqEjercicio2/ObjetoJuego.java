package PaqEjercicio2;

public abstract class ObjetoJuego
{
    protected String nombre;

    public ObjetoJuego(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}
class Arma extends ObjetoJuego {
    private int danio;
    public Arma(String nombre, int danio) {
        super(nombre);
        this.danio = danio;
    }
}

class Pocion extends ObjetoJuego {
    private int curacion;
    public Pocion(String nombre, int curacion) {
        super(nombre);
        this.curacion = curacion;
    }
}
