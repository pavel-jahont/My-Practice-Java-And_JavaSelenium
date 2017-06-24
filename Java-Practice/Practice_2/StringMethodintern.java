/**
 * Created by User on 6/2/2016.
 */
 
             //  Returns a canonical representation for the string object
             //  Этот метод возвращает каноническое представление для объекта строки

public class StringMethodintern {

          public static void main(String args[]){
            String Str1 = new String("- Manual testing: functional, regression, installation, acceptance, smoke, integration, GUI, exploratory;");
            String Str2 = new String("- Requirements and specifications analysis;");

              System.out.println("My Experience:" );
            System.out.println("- Test documentation development: test cases, check lists, test plans;" );
            System.out.println(Str1.intern());

            System.out.println("- Help and user guides revision and update;" );
            System.out.println(Str2.intern());


                  // result [My Experience:
                  //         - Test documentation development: test cases, check lists, test plans;
                  //         - Manual testing: functional, regression, installation, acceptance, smoke, integration, GUI, exploratory;
                  //         - Help and user guides revision and update;
                  //         - Requirements and specifications analysis;]

        }
    }
