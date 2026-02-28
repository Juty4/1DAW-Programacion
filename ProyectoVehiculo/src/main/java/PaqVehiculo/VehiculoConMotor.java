package PaqVehiculo;
import PaqFecha.Fecha;

public class VehiculoConMotor extends Vehiculo
{
    private int potencia;

    public VehiculoConMotor()
    {
        super();
        this.potencia = 0;
    }

    public VehiculoConMotor(String modelo, int precio, int d, int m, int a, int potencia)
    {
        setVehiculoConMotor(modelo, precio, d, m, a, potencia);

    }

    public VehiculoConMotor(String modelo, int precio, Fecha fecha, int potencia)
    {
        setVehiculoConMotor(modelo, precio, fecha, potencia);

    }

    public VehiculoConMotor(Vehiculo v, int potencia)
    {
        setVehiculoConMotor(v,potencia);
    }
    public VehiculoConMotor(VehiculoConMotor v)
    {
        setVehiculoConMotor(v);
    }

    public void setVehiculoConMotor(String modelo,int precio,Fecha fecha, int potencia)
    {
        setModelo(modelo);
        setPrecio(precio);
        setFechaCompra(fecha);
        setPotencia(potencia);
    }

    public void setVehiculoConMotor(String modelo, int precio, int d, int m, int a, int potencia)
    {
        Fecha fecha = new Fecha(d, m, a);

        setModelo(modelo);
        setPrecio(precio);
        setFechaCompra(fecha);
        setPotencia(potencia);
    }

    public void setVehiculoConMotor(VehiculoConMotor v)
    {
        setModelo(v.getModelo());
        setPrecio(v.getPrecio());
        setFechaCompra(v.getFechaCompra());
        setPotencia(v.getPotencia());
    }
    public void setVehiculoConMotor(Vehiculo v, int potencia)
    {
        setModelo(v.getModelo());
        setPrecio(v.getPrecio());
        setFechaCompra(v.getFechaCompra());
        setPotencia(potencia);
    }

    public void setPotencia(int potencia)
    {
        if (potencia < 0)
        {
            throw new PotenciaIncorrecta();
        }
        this.potencia = potencia;
    }
    public int getPotencia()
    {
        return this.potencia;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Potencia: "
                + potencia ;
    }

    public boolean equals(VehiculoConMotor v)
    {
        return (super.equals(v) && this.potencia == v.potencia);
    }
}