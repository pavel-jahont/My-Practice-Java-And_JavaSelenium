/**
 * Created by user on 28.05.16.
 */
public class MultuArraysFor {
    public static void main(String[] args) {
        int [][]  FirstArray;
        FirstArray = new int [2][3];

        FirstArray [0][0] = 7;
        FirstArray [0][1] = 45;
        FirstArray [0][2] = 3;
        FirstArray [1][0] = 49;
        FirstArray [1][1] = 18;
        FirstArray [1][2] = -8;

        for (int i=0; i<2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(FirstArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
