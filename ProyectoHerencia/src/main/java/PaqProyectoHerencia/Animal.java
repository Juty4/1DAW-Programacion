package PaqProyectoHerencia;

import java.time.LocalDate;

public class Animal
{
    private int peso;
    private int dia;
    private int mes;
    private int anio;
    private LocalDate fechaNac;

    public Animal()
    {
        this.peso = 0;
        this.dia = 1;
        this.mes = 1;
        this.anio = 1990;
        this.fechaNac = LocalDate.of(this.anio, this.mes, this.dia);
    }

    public Animal(int peso, int dia, int mes, int anio)
    {
        setAnimal(peso, dia, mes, anio);
    }
    public Animal(int peso, LocalDate fechaNac)
    {
        setAnimal( peso, fechaNac);
    }

    public Animal setAnimal(int peso, int dia, int mes, int anio)
    {
        Animal a = new Animal();
        a.peso = peso;
        a.fechaNac = LocalDate.of(this.anio, this.mes, this.dia);
        return a;
    }
    public Animal setAnimal(int peso,LocalDate fechaNac)
    {
        Animal a = new Animal();
        a.peso = peso;
        a.fechaNac = fechaNac;
        return a;
    }
    public void setAnimal(Animal a)
    {
        this.peso = a.peso;
        this.fechaNac = a.fechaNac;
        this.dia = a.dia;
        this.mes = a.mes;
        this.anio = a.anio;
    }

    public void setPeso(int peso)
    {

        if (peso < 0 || peso > 5000)
        {
            throw new IllegalArgumentException("Error de peso");
        }
        else
            this.peso = peso;
    }
    public int getPeso() {
        return peso;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
}
