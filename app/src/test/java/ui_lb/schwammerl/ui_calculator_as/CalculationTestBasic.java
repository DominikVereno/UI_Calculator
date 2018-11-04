package ui_lb.schwammerl.ui_calculator_as;

import com.fathzer.soft.javaluator.DoubleEvaluator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculationTestBasic
{
    @Test
    public void additionTestBase()
    {
        String expression      = "3+4";

        double result_expected = 7;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 3/100000;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void additionTestEdge()
    {
        String expression      = "0.00001+78.1104";

        double result_expected = 78.11041;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.00001/100000;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void subtractionTestBase()
    {
        String expression      = "9091-10009.111";

        double result_expected = -918.111;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.000001;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void subtractionTestEdge()
    {
        String expression      = "-0.0201001011-300000";

        double result_expected = -300000.0201001011;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.0201001011/100000;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void multiplicationTestBase()
    {
        String expression      = "27*3.4";

        double result_expected = 91.8;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 3.4/100000;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void multiplicationTestEdge()
    {
        String expression      = "-991061*877.12131419";

        double result_expected = -869280726.7624556;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 877.12131419/100000;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void divisionTestBase()
    {
        String expression      = "155/13";

        double result_expected = 11.92307692307692;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.0001;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void divisionTestEdge()
    {
        String expression      = "-0.0109333/-10901107";

        double result_expected = 0.000000001002953186314014;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.000000000001;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void squareTestBase()
    {
        String expression      = "14.022^2";

        double result_expected = 196.616484;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.00001;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void squareTestEdge()
    {
        String expression      = "0.048014468^2";

        double result_expected = 0.002305389137323024;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.0000001;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void rootTestBase()
    {
        String expression      = "29.01^0.5";

        double result_expected = 5.386093203798093;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.00001;

        assertEquals(result_expected, result_actual, tolerance);
    }

    @Test
    public void rootTestEdge()
    {
        String expression      = "0.000239981^0.5";

        double result_expected = 0.01549132015032935;
        double result_actual   = new DoubleEvaluator().evaluate(expression);
        double tolerance       = 0.0000001;

        assertEquals(result_expected, result_actual, tolerance);
    }
}
