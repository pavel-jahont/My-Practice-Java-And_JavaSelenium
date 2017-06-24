                    // 3. Declare a string with your full name and display the result of the work of all
                     //     standard methods of work with strings.

public class FullNameString {
    public static void main(String args[]) {

        String s = "Яхонт Павел Владимирович";
        char chars[] = {'P', 'A', 'V', 'E','L'};
        char chars_selection[] = {'J', 'A', 'H', 'O','N','T'};
        String w = new String(chars);
        String p = new String(chars_selection, 0,4);
        int age = 33;
        int age1;
        String v = " I am " + age + " years old.";


        {
            System.out.println(s);

            System.out.println(s.length());

            System.out.println("sss".length());

            System.out.println(w);
            System.out.println(p);
            System.out.println(v);


        }
    }
}
