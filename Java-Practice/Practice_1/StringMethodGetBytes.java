/**
 * Created by User on 6/2/2016.
 */


             // Расшифровать эту строку в последовательность байтов, сохраняя результат в новый массив байтов

import java.io.*;

public class StringMethodGetBytes {
    public static void main(String args[]){
        String Str1 = new String("Anton Semenchenko");

        try{
            byte[] Str2 = Str1.getBytes();
            System.out.println("Returned  Value " + Str2 );

            Str2 = Str1.getBytes( "UTF-8" );
            System.out.println("Returned  Value " + Str2 );

            Str2 = Str1.getBytes( "ISO-8859-1" );
            System.out.println("Returned  Value " + Str2 );
        } catch( UnsupportedEncodingException e){
            System.out.println("Unsupported character set");
        }
    }
}
