import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator find = null;
    @BeforeEach
    void assignedObject(){
        find = new Calculator();
    }

    @Test
    void toCalculateSumOfTwoDoubleInputs(){
        assertEquals(10.0,find.sum(6.0,4.0));
    }

    @Test
    void toCalculateDifferenceBetweenTwoDoubleInputs(){
        assertEquals(5.0,find.difference(10.0,5.0));
    }

    @Test
    void toCalculateProductOfTwoDoubleInputs(){
        assertEquals(10.0,find.product(5.0,2.0));
    }

    @Test
    void toCalculateQuotientWhenDividingTwoDoubleInputs(){
        assertEquals(2.0,find.division(4.0,2.0));
    }
}
