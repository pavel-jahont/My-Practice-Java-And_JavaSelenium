/**
 * Created by User on 6/2/2016.
 */

                  // Этот метод сравнивает эту строку с указанным объектом
                  // This method compares this string to the specified object

public class StringMethodEquals {

    public static void main(String args[]) {
        String Str1 = new String("Java for Automation Engineer");
        String Str2 = Str1;
        String Str3 = new String("Java for Automation Engineer");
        boolean compare1;

        compare1 = Str1.equals( Str2 );
        System.out.println("Returned Value = " + compare1 );

        compare1 = Str1.equals( Str3 );
        System.out.println("Returned Value = " + compare1 );

        // result : [Returned Value = true
        //           Returned Value = true]
    }

}
