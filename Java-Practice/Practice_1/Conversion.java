/**
 * Created by User on 5/20/2016.
 */
public class Conversion {
    public static void main(String args[]) {

        byte b;
        int i = 257;
        double d = 314.577;
        System.out.println("\n Преобразование int в byte.");
        b = (byte) i;
        System.out.println("i и b " + i + " " + b);

        System.out.println("\n Преобразование double в int.");
        i = (int) d;
        System.out.println("d и i " + d + " " + i);

        System.out.println("\n Преобразование double в byte.");
        b = (byte) d;
        System.out.println("d и b " + d + " " + b);


    }
}
