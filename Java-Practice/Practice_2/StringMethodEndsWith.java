/**
 * Created by User on 6/2/2016.
 */

             // Tests if this string ends with the specified suffix
             // Этот метод проверяет, является ли эта строка заканчивается указанным суффиксом

public class StringMethodendsWith {

    public static void main(String args[]){
        String Str = new String("IT-Academy : Java for Automation Engineer");
        boolean retVal;

        retVal = Str.endsWith( "Engineer" );
        System.out.println("Returned Value = " + retVal );

        retVal = Str.endsWith( "neer" );
        System.out.println("Returned Value = " + retVal );

        // result   [Returned Value = true
        //           Returned Value = true]

    }
}
