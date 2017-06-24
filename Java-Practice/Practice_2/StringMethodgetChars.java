/**
 * Created by User on 6/2/2016.
 */

             //   Copies characters from this string into the destination character array
             //   Этот метод копирует символы из этой строки в массив символов назначения

public class StringMethodgetChars {
    public static void main(String args[]){
        String Str1 = new String("I consider that a good and strong team - the key to success!");
        char[] Str2 = new char[8];

        try{
            Str1.getChars(2, 10, Str2, 0);
            System.out.print("Copied Value = " );
            System.out.println(Str2 );

        }catch( Exception ex){
            System.out.println("Raised exception...");
        }
    }
}
