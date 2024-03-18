package themathlib;
import java.lang.Math;
public class TheMathLib {
    public static void main(String[] args) {
        double a = 5;
       a = Math.pow(a, 3);
        System.out.println(a);
    }
}

 
class Characters {
    public static void main(String[] args) {
        char a = 'A';
        char b = 77;
        System.out.print(a);
        System.out.print(b);
    }
} 

class Strings  {
    public static void main(String[] args) {
        char test1 = 'H';
        String test2 = "Labas \"mielas\" Rytas ";
        String test3 = "Lietuva";

        System.out.println(test1);
        System.out.print(test2.replace("Rytas", "Vakaras"));
        System.out.print(test3.toUpperCase());
    }


}