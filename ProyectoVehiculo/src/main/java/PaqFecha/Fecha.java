package PaqFecha;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructor por defecto (según enunciado, fecha por defecto)
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 2024;
    }

    // Constructor con parámetros
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Getters y Setters
    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }

    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }
}