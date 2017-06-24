/**
 * Created by User on 6/15/2016.
 */
public class Car {

    public void start(){
        System.out.println("Let's GO!");
    }

    public void stop(){
        System.out.println("STOP!");
    }

    public int drive(int howlong) {
        int distance = howlong * 60;
        return distance;
    }



}
