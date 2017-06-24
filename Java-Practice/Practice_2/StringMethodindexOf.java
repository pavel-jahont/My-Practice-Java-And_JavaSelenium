/**
 * Created by User on 6/2/2016.
 */

             //  Returns the index within this string of the first occurrence of the specified character
             //  Возвращает индекс в пределах этой строки первого вхождения указанного символа

public class StringMethodindexOf {

    public static void main(String args[]) {
        String Str = new String("Pavel Jahont");


        System.out.print("Found Index :" );
        System.out.println(Str.indexOf( 'o' ));
        System.out.print("Found Index :" );
        System.out.println(Str.indexOf( 'o', 10 ));

    }
}
