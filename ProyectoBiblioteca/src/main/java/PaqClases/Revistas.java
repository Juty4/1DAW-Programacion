package PaqClases;

public class Revistas
{
    private String codigo;
    private  String titulo;
    private int aniopub;

    public Revistas()
    {
        this.codigo = "";
        this.titulo = "";
        this.aniopub = 2000;
    }
    public Revistas(String codigo,String titulo,int aniopub)
    {
        setCodigo(codigo);
        setTitulo(titulo);
        setAniopub(aniopub);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniopub() {
        return aniopub;
    }

    public void setAniopub(int aniopub) {
        try{
            if (aniopub > 0)
                this.aniopub = aniopub;
            else
                throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e){System.out.printf("Error al introducor año en revistas");}
    }

}
