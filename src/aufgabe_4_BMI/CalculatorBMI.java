package aufgabe_4_BMI;

import java.util.Scanner;

public class CalculatorBMI {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Größe in Zentimeter: ");
        int height = scan.nextInt();
        System.out.println("Gewicht in Kilogram: ");
        int weight = scan.nextInt();

        textOutput(calculateBmi(height, weight));
    }

    public static double calculateBmi(int heightInCentimeters, int weightInKilograms){
        return weightInKilograms / (heightInCentimeters * heightInCentimeters / 10_000);
    }

    public static void textOutput(double bmi){
        String category = "";

        if(bmi < 18.5){
            category = "untergewichtig";
        } else if(/* bmi >= 18.5 && */ bmi < 25){
            category = "normalgewichtig";
        } else if(/* bmi >= 25 && */ bmi <= 30){
            category = "übergewichtig";
        }  else if(bmi > 30){
            category = "schwer übergewichtig";
        }

        System.out.println("Ihr BMI ist " + bmi + " und Sie sind damit " + category + ".");
    }
}
