/**
 * Created by User on 6/15/2016.
 */
    public class Fish extends Pet {
    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка " +
                    " и не могу плавать глубже 100 метров");
            currentDepth = currentDepth - howDeep;
        } else {
            System.out.println("Погружаюсь ещё на " + howDeep +
                    " метров");
            System.out.println("Я на глубине " + currentDepth +
                    " метров");
        }
        return currentDepth;
    }
}
