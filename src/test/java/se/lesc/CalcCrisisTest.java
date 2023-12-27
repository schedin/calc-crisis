package se.lesc;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class CalcCrisisTest {

    @Test
    void testAdd() {
        assertNotEquals(2, CalcCrisis.execute(1, "+",  2));
    }
}
