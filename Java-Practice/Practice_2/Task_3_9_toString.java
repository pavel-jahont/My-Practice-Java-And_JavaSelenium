/**
 * Created by User on 6/4/2016.
 */

class User {
    private String Order;
    private String NumberOfServings;
    private double TotalPrice;

    User(String Order, String NumberOfServings, double TotalPrice)
    {
        this.Order = Order;
        this.NumberOfServings = NumberOfServings;
        this.TotalPrice = TotalPrice;
    }

    public String toString()
    {
        return this.Order+" "+this.NumberOfServings+", "+this.TotalPrice;
    }
}
public class Check {
    public static void main(String[] args) {
        System.out.println();
        User user = new User ("Ваш заказ 190587      ", "Количество порций 23       ", 46.69 );
        System.out.println(user);
    }
}
