/**
 * Created by User on 6/4/2016.
 */

           /* Программа, исспользующая класс Box
                     Но файл должен быть назван BoxDemo.java
                         */

public class iClassBox {
    double width;
    double height;
    double depth;
}
// Этот класс объявляет объект типа iClassBox
class BoxDemo {
    public static void main(String[] args) {
        iClassBox mybox = new iClassBox();
        double vol;

        // присваивание значений переменным экземпляра mybox
        mybox.width = 100;
        mybox.height = 200;
        mybox.depth = 300;
        // вычисление объёма параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объём равен " + vol);
    }
}
