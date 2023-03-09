package aufgabe_4_BMI;

import java.util.Scanner;

public class CalculatorBMI {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Größe in Zentimeter: ");
        double height = scan.nextDouble();
        System.out.println("Gewicht in Kilogram: ");
        double weight = scan.nextDouble();

        double calculatedBMI = calculateBmi(height, weight);

        System.out.println("Ihr BMI ist " + calculatedBMI + " und Sie sind damit " + textOutput(calculatedBMI) + ".");
    }

    /**
     * Calculates BMI
     * @param heightInCentimeters
     * @param weightInKilograms
     * @return BMI as a double
     */
    public static double calculateBmi(double heightInCentimeters, double weightInKilograms){
        //double meter = heightInCentimeters / 100;
        return weightInKilograms / (heightInCentimeters * heightInCentimeters / 10_000);
    }

    public static BMICategory textOutput(double bmi){

        if(bmi < 18.5){
            return BMICategory.UNTERGEWICHTIG;
        } else if(/* bmi >= 18.5 && */ bmi < 25){
            return BMICategory.NORMALGEWICHTIG;
        } else if(/* bmi >= 25 && */ bmi <= 30){
            return BMICategory.ÜBERGEWICHTIG;
        }  else{
            return BMICategory.SCHWER_ÜBERGEWICHTIG;
        }

    }
}
