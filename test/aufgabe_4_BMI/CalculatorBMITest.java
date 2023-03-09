package aufgabe_4_BMI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorBMITest {

    @Test
    public void underweight(){
        int height = 200;
        int weight = 60;

        // assertEquals(CalculatorBMI.calculateBmi(height, weight), 18.5);
        assertTrue(CalculatorBMI.calculateBmi(height, weight) < 18.5);
    }

    @Test
    public void normalweight(){
        int height = 180;
        int weight = 70;

        assertTrue(CalculatorBMI.calculateBmi(height, weight) >= 18.5 && CalculatorBMI.calculateBmi(height, weight) < 25);
    }

    @Test
    public void overweight(){
        int height = 170;
        int weight = 50;

        assertTrue(CalculatorBMI.calculateBmi(height, weight) >= 25 && CalculatorBMI.calculateBmi(height, weight) <= 30);
    }

    @Test
    public void  severely_overweight(){
        int height = 160;
        int weight = 80;

        assertTrue(CalculatorBMI.calculateBmi(height, weight) > 30);
    }

}