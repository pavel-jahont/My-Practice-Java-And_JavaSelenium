/**
 * Created by User on 6/2/2016.
 */

             //  Compares this String to another Object
             //  Метод сравнивает эту строку на другой объект либо сравнивает две строки лексикографически

public class StringMethodsCompareTo {
    public static void main(String args[]) {
        String str1 = "MyNameIsPaveL12345";
        String str2 = "MyNameIsPaveL";
        String str3 = "Integers are not immutable";

        int result = str1.compareTo( str2 );
        System.out.println(result);

        // result : [5]

    }

}
