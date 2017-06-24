/**
 * Created by User on 04.06.16.
 */
public class boxDemo2 {
    public static void main(String[] args) {
        iClassBox mybox1 = new iClassBox();
        iClassBox mybox2 = new iClassBox();
        double v1;

        // присваивание значений переменныи экземпляра mybox1

        mybox1.width = 30;
        mybox1.height = 35;
        mybox1.depth = 45;

        // присваивание значений переменныи экземпляра mybox2

        mybox2.width = 10;
        mybox2.height = 15;
        mybox2.depth = 2;

        // вычисление объёма первого параллелепипеда
        v1 = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объём равен " + v1);

        // вычисление объёма первого параллелепипеда
        v1 = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объём равен " + v1);

    }
}
