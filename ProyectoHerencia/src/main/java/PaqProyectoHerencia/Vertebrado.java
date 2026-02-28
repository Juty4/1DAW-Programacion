package PaqProyectoHerencia;

import java.time.LocalDate;

public class Vertebrado extends Animal
{
    private int numVertebras;

    public Vertebrado(int peso, int dia, int mes, int anio, int numVertebras) {
        setVertebrado(peso, anio, mes, dia, numVertebras);
    }

    public Vertebrado(int peso, LocalDate fechaNac, int numVertebras) {
        setVertebrado(peso, fechaNac, numVertebras);
    }

    public Vertebrado(Animal a,int numVertebras)
    {
        setVertebrado(a, numVertebras);
    }

    public Vertebrado(Vertebrado v)
    {
        setVertebrado(v);
    }

    public Vertebrado()
    {
        super();
        this.numVertebras = 0;
    }

    public int getNumVertebras()
    {
        return numVertebras;
    }

    public void setNumVertebras(int numVertebras)
    {
        if (numVertebras < 0 || numVertebras > 1000)
        {
            throw new IllegalArgumentException("Error de peso");
        }
        else
            this.numVertebras = numVertebras;
    }

    public Vertebrado setVertebrado(int peso, int anio, int mes, int dia, int numVertebras)
    {
        Vertebrado v = new Vertebrado();

        v.setAnimal(peso,anio,mes,dia);
        v.setNumVertebras(numVertebras);

        return v;
    }
    public Vertebrado setVertebrado(int peso, LocalDate d, int numVertebras)
    {
        Vertebrado v = new Vertebrado();

        v.setAnimal(peso,d);
        v.setNumVertebras(numVertebras);

        return v;
    }
    public Vertebrado setVertebrado(Animal a, int numVertebras)
    {
        Vertebrado v = new Vertebrado();

        v.setAnimal(a);
        v.setNumVertebras(numVertebras);

        return v;
    }
    public Vertebrado setVertebrado(Vertebrado v)
    {
        Vertebrado v2 = new Vertebrado();

        v2.setAnimal(v.getPeso(), v.getFechaNac());
        v2.setNumVertebras(v.getNumVertebras());

        return v2;
    }


}
