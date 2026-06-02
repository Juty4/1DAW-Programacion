package PaqClases;

public class DemoMetodoGenerico
{
    public static <T, V extends T> boolean estaEn(T t, V[] v){
        for (V v1: v) {
            if (t.equals(v1)) {
                return true;
            }
        }
        return false;
    }


}
