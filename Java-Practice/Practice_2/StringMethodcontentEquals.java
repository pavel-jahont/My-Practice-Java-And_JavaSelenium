/**
 * Created by User on 6/2/2016.
 */
             // Returns true if and only if this String represents the same sequence of characters as the specified StringBuffer
             // Возвращает истину, только если эта строка представляет собой такую же последовательность символов,
             // что указанный StringBuffer

public class StringMethodcontentEquals {

    public static void main(String args[]) {
        String str1 = "PavelJahont";
        String str2 = "Pavel Jahont";
        StringBuffer str3 = new StringBuffer( "Pavel_Jahont");

        boolean  result = str1.contentEquals( str3 );
        System.out.println(result);

        result = str2.contentEquals( str3 );
        System.out.println(result);

        //  result [false
        //          false]

    }
}
