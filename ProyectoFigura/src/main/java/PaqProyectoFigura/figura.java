package PaqProyectoFigura;

abstract class figura
{
    public double dim1;
    public double dim2;

    public figura()
    {
        this.dim1 = 1;
        this.dim2 = 1;
    }
    public figura(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public figura(figura f)
    {
        this.dim1 = f.dim1;
        this.dim2 = f.dim2;
    }
    abstract public double area();

    public void ver_datos()
    {
        System.out.printf("____________");
        System.out.printf("dim1: " + this.dim1);
        System.out.printf("dim2: " + this.dim2);
    }

}
class rectangulo extends figura
{
    public double diagonal;

    @Override
    public double area()
    {
        return this.dim1 * this.dim2;
    }
    public double diagonal()
    {

        return diagonal;
    }
    @Override
    public void ver_datos()
    {
        super.ver_datos();
        System.out.printf("diagonal: " + this.diagonal());
    }
}

class triangulo extends figura
{
    @Override
    public double area()
    {
        return (this.dim1 * this.dim2) / 2;
    }

}
