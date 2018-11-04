package ui_lb.schwammerl.ui_calculator_as;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.fathzer.soft.javaluator.*;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttons    = new CalculatorButtons   (this);
        textFields = new CalculatorTextFields(this);

        buttons   .install();
        textFields.install();
    }

    public CalculatorButtons getButtons()
    {
        return buttons;
    }

    public CalculatorTextFields getTextFields()
    {
        return textFields;
    }

    private CalculatorButtons    buttons;
    private CalculatorTextFields textFields;
}
