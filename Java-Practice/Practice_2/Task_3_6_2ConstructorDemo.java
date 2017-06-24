/**
 * Created by User on 6/4/2016.
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        Constructor mybox1= new Constructor(15,15,12);
        Constructor mybox2= new Constructor(10,7,25);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объём первого равен " + vol);
        vol = mybox2.volume();
        System.out.println("Объём первого равен " + vol);
    }
}
