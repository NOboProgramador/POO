package Variable;
import java.util.Scanner;

public class HolaMundo_1 {

    public static void main(String[] args) {

        float floatVar = 1000.10F;
        System.out.println("floatVar = " + floatVar);
        
        System.out.println("bits tipo float:" + Float.SIZE);
        System.out.println("bytes tipo float:" + Float.BYTES);
        System.out.println("valor minimo tipo float:" + Float.MIN_VALUE);
        System.out.println("valor maximo tipo float:" + Float.MAX_VALUE);
        
        double doubleVar = 100D;
        System.out.println("doubleVar = " + doubleVar);
        
        System.out.println("bits tipo double:" + Double.SIZE);
        System.out.println("bytes tipo double:" + Double.BYTES);
        System.out.println("valor minimo tipo double:" + Double.MIN_VALUE);
        System.out.println("valor maximo tipo double:" + Double.MAX_VALUE);
        
    }
}
