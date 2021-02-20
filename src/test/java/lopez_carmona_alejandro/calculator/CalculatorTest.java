package lopez_carmona_alejandro.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() { // Create object before compilation
        calculator = new Calculator();
    }

    /*
     * testCalc() test method
     */
    @Test
    void testCalc() {
        double first = 3;
        String second = "5";
        float third = 2f;

        try {
            Assertions.assertEquals(8, calculator.calc(first, second, '+', third));
            Assertions.assertEquals(-2, calculator.calc(first, second, '-', third));
            Assertions.assertEquals(15, calculator.calc(first, second, '*', third));
            Assertions.assertEquals(0.6, calculator.calc(first, second, '/', third));
            Assertions.assertEquals(3d, calculator.calc(first, second, '%', third));
            Assertions.assertEquals(243, calculator.calc(first, second, '^', third));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
