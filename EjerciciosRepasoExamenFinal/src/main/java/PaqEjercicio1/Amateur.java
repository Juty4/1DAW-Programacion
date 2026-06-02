package PaqEjercicio1;

public class Amateur extends Participante
{
    private int nivelDiscord;

    public Amateur(){
        super();
        this.nivelDiscord=1;
    }

    public Amateur(String nickname, int edad, int horasJugadas, int  nivelDiscord){
        super(nickname, edad, horasJugadas);
        this.nivelDiscord=nivelDiscord;
    }

    public int getNivelDiscord() {
        return nivelDiscord;
    }

    public void setNivelDiscord(int nivelDiscord) {
        this.nivelDiscord = nivelDiscord;
    }

    @Override
    public String toString() {
        return (super.toString() + "Amateur{" +
                "nivelDiscord=" + nivelDiscord +
                '}');
    }
}
