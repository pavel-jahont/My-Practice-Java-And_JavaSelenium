import java.util.Scanner;
public class Electronic_Menu {
    public static void main(String[] args) {

        int departure_date;
        int switch_number = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Чтобы узнать расписание поездов Минск-Москва на июнь, введите время отправления в часах(примерно час отправления). Например: 19");
        departure_date = input.nextInt();

        System.out.println(departure_date);
        {
            if (0 < departure_date && departure_date < 6) {
                System.out.println("Расписание поездов с 00.00 до 05.59");
                switch_number = 1;
            }
            else if (6 <= departure_date && departure_date < 12) {
                System.out.println("Расписание поездов с 06.00 до 11.59");
                switch_number = 2;
            }
            else if (12 <= departure_date && departure_date < 18) {
                System.out.println("Расписание поездов с 12.00 до 17.59");
                switch_number = 3;
            }
            else if (18 <= departure_date && departure_date < 24) {
                System.out.println("Расписание поездов с 18.00 до 23.59");
                switch_number = 4;

            }
        }

        switch ( switch_number ) {
            case 1:
                System.out.println("\nНомер поезда: 058Б  \nГродно — Санкт-Петербург-Витеб.  \nОтпр: 00:56 Минск   \nПрибытие: 15:25 Санкт-Петербург    \nВремя в пути: 14 ч 29 мин");

                break;

            case 2:
                System.out.println("\nВ это время нет поездов. Выберите другое время если необходимо.");

                break;

            case 3:
                System.out.println("\nНомер поезда: 022А  \nПрага Гл. — Хеб — Москва Белорусская  \nОтпр: 14:20 Минск  \nПрибытие: 07:23 Санкт-Петербург \nВремя в пути: 17 ч 03 мин");

                break;

            case 4:
                System.out.println("\nНомер поезда: 052Б  \nМинск-Пассажирский — Санкт-Петербург-Витеб.  \nОтпр: 18:00 Минск  \nПрибытие: 07:23 Санкт-Петербург  \nВремя в пути: 13 ч 23 мин");

                System.out.println("\n\nНомер поезда: 050Б  \nБрест-Центральный — Санкт-Петербург-Витеб.  \nОтпр: 18:45 Минск   \nПрибытие: 09:17 Санкт-Петербург   \nВремя в пути: 14 ч 32 мин");
                break;

            default:
                System.out.println("\nВы ввели время отправления. Вернное время отправления 0-24");
                break;
        }
    }
}



