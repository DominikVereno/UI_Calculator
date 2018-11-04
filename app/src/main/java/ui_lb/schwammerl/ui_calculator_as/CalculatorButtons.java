package ui_lb.schwammerl.ui_calculator_as;

import android.widget.Button;

public class CalculatorButtons
{
    public CalculatorButtons(MainActivity mainActivity_)
    {
        homeActivity = mainActivity_;
    }

    private CalculatorButtons(){}

    public void install()
    {
        connectToUI();
        setListeners();
    }

    private void connectToUI()
    {
        button_clear    = homeActivity.findViewById( R.id._button_clear    );
        button_square   = homeActivity.findViewById( R.id._button_square   );
        button_root     = homeActivity.findViewById( R.id._button_root     );
        button_divide   = homeActivity.findViewById( R.id._button_divide   );

        button_7        = homeActivity.findViewById( R.id._button_7        );
        button_8        = homeActivity.findViewById( R.id._button_8        );
        button_9        = homeActivity.findViewById( R.id._button_9        );
        button_multiply = homeActivity.findViewById( R.id._button_multiply );

        button_4        = homeActivity.findViewById( R.id._button_4        );
        button_5        = homeActivity.findViewById( R.id._button_5        );
        button_6        = homeActivity.findViewById( R.id._button_6        );
        button_minus    = homeActivity.findViewById( R.id._button_minus    );

        button_1        = homeActivity.findViewById( R.id._button_1        );
        button_2        = homeActivity.findViewById( R.id._button_2        );
        button_3        = homeActivity.findViewById( R.id._button_3        );
        button_plus     = homeActivity.findViewById( R.id._button_plus     );

        button_parenth  = homeActivity.findViewById( R.id._button_parenth  );
        button_0        = homeActivity.findViewById( R.id._button_0        );
        button_comma    = homeActivity.findViewById( R.id._button_comma    );
        button_equals   = homeActivity.findViewById( R.id._button_equals   );
    }

    private void setListeners()
    {
        button_clear.   setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.CLEAR       ));
        button_square.  setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.SQUARE      ));
        button_root.    setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.ROOT        ));
        button_divide.  setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.DIVIDE      ));

        button_7.       setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.SEVEN       ));
        button_8.       setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.EIGHT       ));
        button_9.       setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.NINE        ));
        button_multiply.setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.MULTIPLY    ));

        button_4.       setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.FOUR        ));
        button_5.       setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.FIVE        ));
        button_6.       setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.SIX         ));
        button_minus.   setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.MINUS       ));

        button_1.       setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.ONE         ));
        button_2.       setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.TWO         ));
        button_3.       setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.THREE       ));
        button_plus.    setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.PLUS        ));

        button_parenth. setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.PARENTHESIS ));
        button_0.       setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.ZERO        ));
        button_comma.   setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.COMMA       ));
        button_equals.  setOnClickListener(new CalculatorButtonListener( homeActivity, ButtonType.EQUALS      ));
    }

    private MainActivity homeActivity;

    private Button button_clear;
    private Button button_square;
    private Button button_root;
    private Button button_divide;

    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_multiply;

    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_minus;

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_plus;

    private Button button_parenth;
    private Button button_0;
    private Button button_comma;
    private Button button_equals;
}
