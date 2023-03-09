package aufgabe_4_BMI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorBMITest {

    @Test
    public void underweight(){
        BMICategory actual = CalculatorBMI.textOutput(18);
        BMICategory expected = BMICategory.UNTERGEWICHTIG;

        assertEquals(expected, actual);
    }

    @Test
    public void normalweight(){
        BMICategory actual = CalculatorBMI.textOutput(20);
        BMICategory expected = BMICategory.NORMALGEWICHTIG;

        assertEquals(expected, actual);
    }

    @Test
    public void overweight(){
        BMICategory actual = CalculatorBMI.textOutput(27);
        BMICategory expected = BMICategory.ÜBERGEWICHTIG;

        assertEquals(expected, actual);
    }

    @Test
    public void  severely_overweight(){
        BMICategory actual = CalculatorBMI.textOutput(32);
        BMICategory expected = BMICategory.SCHWER_ÜBERGEWICHTIG;

        assertEquals(expected, actual);
    }

}