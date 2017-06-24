/**
 * Created by User on 6/15/2016.
 */
public class PetMaster {
        public static void main(String[] args) {
            Pet myPet = new Pet();

            String petReaction;
            petReaction = myPet.say("Чик!! Чирик!!");
            System.out.println(petReaction);

            myPet.sleep();

            myPet.eat();
        }
    }
