package aufgabe_6_Ratespiel;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel {

    //static int randomNumber = new Random().nextInt(100);
    public static void main(String [] args){
        readNumber(new Random().nextInt(100));
    }

    static void readNumber(int randomNumber){
        Scanner scan = new Scanner(System.in);

        System.out.println("Number: ");
        int guess = scan.nextInt();

        if(guess == randomNumber){
            System.out.println("Gewonnen!");
        } else {
            if (guess < randomNumber) {
                System.out.println("Größer!");
            } else {
                System.out.println("Kleiner!");
            }
            readNumber(randomNumber);
        }
    }

}
