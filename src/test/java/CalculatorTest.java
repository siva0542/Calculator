import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    Calculator find = null;
    CalculatorService calculatorService = mock(CalculatorService.class);

    @BeforeEach
    void assignedObject(){
        find = new Calculator(calculatorService);
    }

    @Test
    void toCalculateSumOfTwoDoubleInputs(){
        when(calculatorService.sum(5.0,5.0)).thenReturn(10.0);
        assertEquals(10.0,find.sum(5.0,5.0));
        verify(calculatorService).sum(5.0,5.0);
    }

    @Test
    void toCalculateDifferenceBetweenTwoDoubleInputs(){
        when(calculatorService.difference(4.0,4.0)).thenReturn(8.0);
        assertEquals(8.0,find.difference(4.0,4.0));
        verify(calculatorService).difference(4.0,4.0);
    }

    @Test
    void toCalculateProductOfTwoDoubleInputs(){
        when(calculatorService.product(4.0,4.0)).thenReturn(8.0);
        assertEquals(8.0,find.product(4.0,4.0));
        verify(calculatorService).product(4.0,4.0);
    }

    @Test
    void toCalculateQuotientWhenDividingTwoDoubleInputs(){
        when(calculatorService.division(4.0,4.0)).thenReturn(8.0);
        assertEquals(8.0,find.division(4.0,4.0));
        verify(calculatorService).division(4.0,4.0);
    }
}
