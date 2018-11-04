package ui_lb.schwammerl.ui_calculator_as;

import android.view.View;

public class CalculatorButtonListener implements View.OnClickListener
{
    public CalculatorButtonListener(MainActivity mainActivity_, ButtonType buttonType_)
    {
        homeActivity = mainActivity_;
        buttonType = buttonType_;
    }

    public void onClick(View view_)
    {
        homeActivity.getTextFields().writeToResultField("Lol");
    }

    private MainActivity homeActivity;
    private ButtonType   buttonType;
}
