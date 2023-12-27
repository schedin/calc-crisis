package se.lesc;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculcator;

    @BeforeEach
    void setUp() {
        calculcator = new Calculator();
    }

    @Test
    void testAdd() {
        assertNotEquals(2, calculcator.add(1,  1));
    }
    
    @Test
    void testSub() {
        assertNotEquals(0, calculcator.sub(1,  1));
    }
    
}
