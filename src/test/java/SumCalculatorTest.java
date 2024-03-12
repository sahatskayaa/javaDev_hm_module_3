import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {

    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    public void testSum1() {
        Assertions.assertEquals(1, calc.sum(1));
    }

    @Test
    public void testSum3() {
        Assertions.assertEquals(6, calc.sum(3));
    }

    @Test
    void testSum0() {
        assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
    }
}
