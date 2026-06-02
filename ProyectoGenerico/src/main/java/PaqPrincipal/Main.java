package PaqPrincipal;
import PaqClases.*;
class generica<T>{
    T objeto;
    generica(T objeto){
        this.objeto = objeto;
    }

    T getObjeto(){
        return this.objeto;
    }

    @Override
    public String toString() {
        return "Generica{" +
                "objeto=" + objeto + "Clase=" + objeto.getClass().getName() +
                '}';
    }
}

class miclase
{
    public int p1;

    public miclase(int p){
        this.p1 = p;
    }

    @Override
    public String toString() {
        return "miclase( "+ "p1= " + p1 + " Tipo " + this.getClass().getName() + " )";
    }
}

class noGenerica
{
    Object objeto;

    noGenerica(Object obj){
        this.objeto = obj;
    }

    Object getObjeto()
    {
        return this.objeto;
    }

    @Override
    public String toString() {
        return "noGenerica(objeto= " + this.objeto + " )";
    }

}

class generica2tipos<T,V>
{
    T objeto1;
    V objeto2;

    generica2tipos(T obj1, V obj2){
        this.objeto1 = obj1;
        this.objeto2 = obj2;
    }

    T getObjeto1()
    {
        return this.objeto1;
    }

    @Override
    public String toString() {
        return "generica2tipos( " + this.objeto1 + " , " + this.objeto2 + " )";
    }
}

class constructorGenerico {
    private double valor;
    <T extends Number> constructorGenerico(T valor){
    this.valor = valor.doubleValue();
    }
    @Override
    public String toString() {
        return "{" + "Valor=" + valor + "}";
    }
}
interface MinMax<T extends Comparable<T>>{
    T min();
    T max();
}
class miclaseinterfacegenerica<T extends Comparable<T>> implements MinMax<T> {
    T[] valores;
    public miclaseinterfacegenerica(T[] valores){
        this.valores = valores;
    }
    public T min(){
        T min = this.valores[0];
        for(T t: valores){
            if (t.compareTo(min) < 0)
                min = t;
        }
        return min;
    }
    @Override
    public T max(){
        T max = this.valores[0];
        for (T t:valores){
            if (t.compareTo(max) > 0)
                max=t;
        }
        return max;
    }
}

public class Main {

    static void main() {
//        generica<Integer> n = new generica<>(88);
//        System.out.println("n = " + n);
//        int v = n.getObjeto();
//        System.out.println("valor = " + v);
//
//        // Ahora con String
//        generica<String> cadena = new generica<>("Java");
//        System.out.println("n = " + cadena);
//        String str = cadena.getObjeto();
//        System.out.println("valor = " + str);
//
//        miclase m = new miclase(88);
//        System.out.println("miclase = " + m);

        DemoMetodoGenerico demo = new DemoMetodoGenerico();
        Integer numeros[] = {1,2,3,4,5};

        if (demo.estaEn(2, numeros))
        {
            System.out.println("2 está en numeros");
        }
        if (!demo.estaEn(7, numeros))
        {
            System.out.println("7 NO está en numeros");
        }
        String nombres[] ={"uno","dos","tres","cuatro","cinco"};


    }
}
