public class Tasks_of_Section_2 {
    public static void main(String[] args)
    {

                       // 1. Написать программу выводящую информацию о себе //


// System.out.println("My name is Pavel Jahont. I'm Software testing engineer. I like Testing, Aviation and Hockey!!! And I love this LIVE");







                       // 2. Объявить перевенные всех вам известных типов и вывести их значения на экран.

        byte a=127;                           // от -128 до 127
        short b= -32768;                      // от -32768 до 32767
        int c= 2147483647;                    // от –2 147 483 648 до 2 147 483 647
        long d=9223372036854775807l;          // от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807
        char y='Y';
        boolean z = true;
        float f = 1.5456f;
        double x =  3.146576465651651D+20 ;
        {

            System.out.println("a = " + a + ";");
            System.out.println("b = " + b + ";");
            System.out.println("c = " + c + ";");
            System.out.println("d = " + d + ";");
            System.out.println("y = " + y + ";");

            if(z)
                   System.out.println("Z - правда");
               z = false;
                if(z)
                 System.out.println("Z - не правда");

            System.out.println("f = " + f);
             System.out.println("x = " + x);


        }


    }

}
