/**
 * Created by User on 6/2/2016.
 */

             //  Возвращает строку, которая представляет собой последовательность символов в указанном массиве

public class StringMethodcopyValueOf {
    public static void main(String args[]) {
        char[] Str1 = {'J', 'a', 'v', 'a', ' ', 'A', 'u', 't', 'o', 'm', 'a', 't', 'i', 'z', 'a', 't', 'i', 'o', 'n', };
        String Str2 = "";

        Str2 = Str2.copyValueOf( Str1 );
        System.out.println("Returned String: " + Str2);

        Str2 = Str2.copyValueOf( Str1, 2, 6 );
        System.out.println("Returned String: " + Str2);


        // result : [Returned String: Java Automatization
        //           Returned String: va Aut]     -    from 2symbol to 7

    }
}
