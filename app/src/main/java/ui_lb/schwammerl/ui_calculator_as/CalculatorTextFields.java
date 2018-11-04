package ui_lb.schwammerl.ui_calculator_as;

import android.widget.TextView;

public class CalculatorTextFields
{
    public CalculatorTextFields(MainActivity mainActivity_)
    {
        homeActivity = mainActivity_;
    }

    public void install()
    {
        textView_entry  = homeActivity.findViewById( R.id._textView_entry  );
        textView_result = homeActivity.findViewById( R.id._textView_result );
    }

    public void writeToEntryField(String text_)
    {
        textView_entry.setText(text_);
    }

    public void writeToResultField(String text_)
    {
        textView_result.setText(text_);
    }

    private MainActivity homeActivity;

    private TextView textView_entry;
    private TextView textView_result;
}
