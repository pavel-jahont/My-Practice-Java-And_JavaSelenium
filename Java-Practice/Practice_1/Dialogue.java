import java.util.Scanner;

public class Dialogue {
    public static void main(String args[]) {

        int a;
        boolean t = true;
        boolean p = false;
        int q = 3;
        {

            System.out.println("Девушка, здравствуйте!");
            System.out.println("Подскажите я правильно направляюсь зданию МТС?");
        }
        if (t) {
            System.out.println("ДА");
        } else {
            System.out.println("НЕТ");
        }
        {
            System.out.println("Есть ли рядом ещё какие либо здания с офисами мобильных операторов?");
        }
        if (p) {
            System.out.println("Да");
        } else {
            System.out.println("НЕТ");
        }
        {
            System.out.println("Могу я вас пригласить вместе пообедать?");
        }
        if (q == 3) {
            System.out.println("Да");
        } else {
            System.out.println("НЕТ");
        }
    }
}
