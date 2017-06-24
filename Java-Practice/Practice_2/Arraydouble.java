/**
 * Created by User on 6/4/2016.
 */
public class Arraydouble {
    public static void main(String[] args) {
        double[] arr1 = {1.9, 2.1, 3.8, 0.35};

        // Print all the array elements
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }


        // Summing all elements
            double total = 0;
            for (int i = 0; i < arr1.length; i++) {
                total += arr1[i];
            }
                System.out.println("Total is " + total);


        // Finding the largest element
                double max = arr1[0];
                for (int i = 1; i < arr1.length; i++) {
                    if (arr1[i] > max) max = arr1[i];
                }
                System.out.println("Max is " + max);

        }
    }
