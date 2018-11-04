package ui_lb.schwammerl.ui_calculator_as;

import com.fathzer.soft.javaluator.DoubleEvaluator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculationTestAdvanced
{
    @Test
    public void parenthesisTestBase1()
    {
        String expression      = "19*(1-5)/(18-99)";

        double result_expected = 0.938271605;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.00001;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void parenthesisTestBase2()
    {
        String expression      = "(183-1111)*(0.01+0.0049)";

        double result_expected = -13.8272;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.00001;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void parenthesisTestEdge()
    {
        String expression      = "(99*(1-(3-(-0.01)*(0.001-0.0021)^2))*5)";

        double result_expected = -990.0000059895;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.000000001;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void combinedExpressionBase()
    {
        String expression      = "(123.1-4.0096^2)^(1/2)";

        double result_expected = 10.34519733;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.0000001;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void combinedExpressionEdge()
    {
        String expression      = "(13.002+0.000051)^(1/2)/0.76661/3*2.01";

        double result_expected = 3.151419770336128;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.0000001;

        assertEquals(result_expected, result_actual, tolerance);
    }
}
