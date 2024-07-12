import com.sun.jdi.request.InvalidRequestStateException;
import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    @DisplayName("Positive Test - Successful Addition")
    void testAdditionSuccess() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 10);
        Assertions.assertEquals(15, result);
    }

//    @Test
//    @DisplayName("Negative Test - Invalid Request
//    void testInvalidRequestAddition() {
//        Calculator calculator = new Calculator();
//        Exception e = Assertions.assertThrows(InvalidRequestStateException.class, () -> calculator.add(null, null));
//        Assertions.assertEquals("Request cannot be null", e.getMessage());
//    }
}
