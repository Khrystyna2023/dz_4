import java.util.PrimitiveIterator;
//import java.io.IOException;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner; //імпорт сканера (використовується для ввода даних з клави)

public class Print {
    public static void main(String[] args) {
        }
        public static int myPrint () {
            Scanner UserInput = new Scanner(System.in);  //цей код дозволяє користувачеві читати число з System.in
            System.out.println("Please, enter only integer number p:");
            if(UserInput.hasNextInt()){
                int p = UserInput.nextInt();  //дозволяє ввести любе ціле число
                System.out.println("---" + " " + p + " " + "---");
                return p;
            }
            else
                System.out.println("Incorrect value. Please, enter only integer number");
            //int i = myPrint();
            return myPrint();
        }

    }



