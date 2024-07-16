import com.sun.jdi.request.InvalidRequestStateException;
import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Positive Test - Successful Addition")
    void testAdditionSuccess() {
        int result = calculator.add(5, 10);
        Assertions.assertEquals(15, result);
    }

//    @Test
//    @DisplayName("Negative Test - Invalid Request
//    void testInvalidRequestAddition() {
//        Exception e = Assertions.assertThrows(InvalidRequestStateException.class, () -> calculator.add(null, null));
//        Assertions.assertEquals("Request cannot be null", e.getMessage());
//    }
}
