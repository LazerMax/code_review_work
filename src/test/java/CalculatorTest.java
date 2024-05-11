import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.add(1,1));
    }

    @Test
    void dif() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.dif(1,1));
    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        try {
            assertEquals(5, calc.div(10,2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void times() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.times(2,3));
    }

    @Test
    void solver() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.solver());
    }
}