import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1,1));
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.dif(1,1));
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        try {
            assertEquals(5, calculator.div(10,2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.times(2,3));
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.solver());
    }
}