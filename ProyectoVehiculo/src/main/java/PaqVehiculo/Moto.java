package PaqVehiculo;
import PaqVehiculo.VehiculoConMotor;
import java.util.ArrayList;
import PaqFecha.Fecha;

public class Moto extends VehiculoConMotor {

    private int[] kms = new int[20];
    private int[] gastos = new int[20];
    private String matricula;
    private String propietario;
    private int numRevisiones;

    public Moto()
    {
        Fecha fecha = new Fecha();
        this.matricula = "";
        this.propietario = "";
        this.numRevisiones = 0;
    }

    public Moto(String modelo, int precio, int d, int m, int a, int potencia, String matricula, String propietario, int numRevisiones)
    {
        super(modelo, precio, d, m, a, potencia);
        this.matricula = matricula;
        this.propietario = propietario;
        this.numRevisiones = numRevisiones;
    }

    public Moto(String modelo, int precio, Fecha fecha, int potencia, String matricula, String propietario, int numRevisiones)
    {
        super(modelo, precio, fecha, potencia);
        this.matricula = matricula;
        this.propietario = propietario;
        this.numRevisiones = numRevisiones;
    }

    public Moto(Vehiculo v, int potencia, String matricula, String propietario, int numRevisiones)
    {
        super(v,potencia);
        this.matricula = matricula;
        this.propietario = propietario;
        this.numRevisiones = numRevisiones;
    }

    public Moto(VehiculoConMotor v, String matricula, String propietario, int numRevisiones)
    {
        super(v);
        this.matricula = matricula;
        this.propietario = propietario;
        this.numRevisiones = numRevisiones;
    }

    public Moto(Moto m)
    {
        super();
        this.matricula = m.matricula;
        this.propietario = m.propietario;
        this.numRevisiones = m.numRevisiones;
    }

    public void setMoto(String modelo, int precio, int d, int m, int a, int potencia, String matricula, String propietario, int numRevisiones)
    {
        setVehiculoConMotor(modelo, precio, d, m, a, potencia);
        this.matricula = matricula;
        this.propietario = propietario;
        this.numRevisiones = numRevisiones;
    }




    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getNumRevisiones() {
        return numRevisiones;
    }

    public void setNumRevisiones(int numRevisiones) {
        if (numRevisiones > 0)
        this.numRevisiones = numRevisiones;

    }

    public int[] getGastos() {
        return gastos;
    }

    public void setGastos(int[] gastos) {
        this.gastos = gastos;
    }

    public int[] getKms() {
        return kms;
    }

    public void setKms(int[] kms) {
        this.kms = kms;
    }
}