package PaqEjercicio1;

public class ProPlayer extends Participante
{
    private double sueldoBase;
    private String equipoPatrocinador;

    public ProPlayer(){
        super();
        this.sueldoBase=800.00;
        this.equipoPatrocinador="Heretics";
    }
    public ProPlayer(String nickname,int edad, int horasJugadas, double sueldoBase, String equipoPatrocinador){
        super(nickname, edad, horasJugadas);
        this.sueldoBase=sueldoBase;
        this.equipoPatrocinador=equipoPatrocinador;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getEquipoPatrocinador() {
        return equipoPatrocinador;
    }

    public void setEquipoPatrocinador(String equipoPatrocinador) {
        this.equipoPatrocinador = equipoPatrocinador;
    }

    @Override
    public String toString() {
        return (super.toString() + "ProPlayer{" +
                "sueldoBase=" + sueldoBase +
                ", equipoPatrocinador='" + equipoPatrocinador + '\'' +
                '}');
    }


}
