
   // 7. Implement the TV remote control, using a one-dimensional array.
       // (The user enters the channel number - the program gives the channel name).

import java.util.Scanner;
public class Array_Control_Panel {
    public static void main(String[] args) {
        String[] Array = new String[10];
        Array[0] = "Discovery";
        Array[1] = "EuroSport";
        Array[2] = "EuroNews";
        Array[3] = "TNT";
        Array[4] = "My planet";
        Array[5] = "8 chanel";
        Array[6] = "ONT";
        Array[7] = "Hunting & Fishing";
        Array[8] = "KHL";
        Array[9] = "KHL Live";
        int Click_number;
        Scanner input = new Scanner(System.in);
        {
            System.out.println("Нажмите кнопку на пульте от 1 до 10 включительно");
            Click_number = input.nextInt();
            Click_number--;
        }
        if (0<=Click_number && Click_number <=9) {
            System.out.println("Вы смотрите канал: " + Array[Click_number]);}
        else {
            System.out.println("Такого канала не существует");
        }

    }
}
