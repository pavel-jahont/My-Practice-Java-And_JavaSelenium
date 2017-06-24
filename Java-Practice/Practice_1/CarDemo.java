/**
 * Created by User on 6/15/2016.
 */
public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        int drive1;
        drive1 = car.drive(150);
        System.out.println("Super:  " + drive1);


    }

}
