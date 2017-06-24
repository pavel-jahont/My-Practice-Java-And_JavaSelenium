/**
 * Created by User on 6/4/2016.
 */
public class BoxDemo3 {
    public static void main(String[] args) {
        iClassBox mybox1 = new iClassBox();
        iClassBox mybox2 = new iClassBox();
        double v1;

        // присваивание значений переменныи экземпляра mybox1

        mybox1.width = 55;
        mybox1.height = 12;
        mybox1.depth = 604;

        // присваивание значений переменныи экземпляра mybox2

        mybox2.width = 1;
        mybox2.height = 895;
        mybox2.depth = 9;

        // отображение объёма первого параллелепипеда
        mybox1.volume();
        // отображение объёма второго параллелепипеда
        mybox2.volume();

    }
}
