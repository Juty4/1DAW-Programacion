package PaqEjercicio1;

public abstract class Participante
{
    private String nickname;
    private int edad;
    private int horasJugadas;

    public Participante(){
        this.nickname="Participante0";
        this.edad=1;
        this.horasJugadas=99999;
    }

    public Participante(String nombre, int edad, int horasJugadas){
        this.nickname=nombre;
        this.edad=edad;
        this.horasJugadas=horasJugadas;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHorasJugadas() {
        return horasJugadas;
    }

    public void setHorasJugadas(int horasJugadas) {
        this.horasJugadas = horasJugadas;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nickname='" + nickname + '\'' +
                ", edad=" + edad +
                ", horasJugadas=" + horasJugadas +
                '}';
    }
}
