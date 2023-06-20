import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new StringCalculator();
    }

    @Test
    //checks regular working
    public void test1() throws Exception {
        int res = calculator.add("1,2");
        assertEquals(3, res);
    }
    @Test
    //checks over 1000 bound
    public void test2() throws Exception {
        int res = calculator.add("1,1000");
        assertEquals(1, res);
    }

    @Test
    //checks for negative exception
    public void test3() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> { calculator.add("-1,5"); });
    }

    @Test
    //checks for negative exception AND 1000 bound, end result should be same as negative exception
    public void test4() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> { calculator.add("-1,1000"); });
    }
}
