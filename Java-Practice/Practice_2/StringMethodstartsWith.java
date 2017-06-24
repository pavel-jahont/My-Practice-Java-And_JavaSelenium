/**
 * Created by User on 6/2/2016.
 */
             // Tests if this string starts with the specified prefix
             // Проверяет, начинается ли эта строка с указанного префикса

public class StringMethodstartsWith {

         public static void main(String args[]){
            String Str = new String("Operating systems: iOS, Android");

            System.out.print("Return Value :" );
            System.out.println(Str.startsWith("Operati") );

            System.out.print("Return Value :" );
            System.out.println(Str.startsWith("iOS") );

            System.out.print("Return Value :" );
            System.out.println(Str.startsWith("ting", 5) );



             // result [Return Value :true
             //         Return Value :false
             //         Return Value :true]
        }
}
