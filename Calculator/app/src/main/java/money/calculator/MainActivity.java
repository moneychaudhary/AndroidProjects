package money.calculator;


import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button zeroButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private Button divideButton;
    private Button multiplyButton;
    private Button minusButton;
    private Button addButton;
    private Button resetButton;
    private Button equalButton;
    private Button dotButton;
    private Button deleteButton;
    private Button percentageButton;
    private Button signChangeButton;
    private TextView input;
    private double value1,value2;
    private String operator;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("value",input.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        input.setText(savedInstanceState.getString("value"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zeroButton = (Button) findViewById(R.id.zero_button);
        oneButton = (Button) findViewById(R.id.one_button);
        twoButton = (Button) findViewById(R.id.two_button);
        threeButton = (Button) findViewById(R.id.three_button);
        fourButton = (Button) findViewById(R.id.four_button);
        fiveButton = (Button) findViewById(R.id.five_button);
        sixButton = (Button) findViewById(R.id.six_button);
        sevenButton = (Button) findViewById(R.id.seven_button);
        eightButton = (Button) findViewById(R.id.eight_button);
        nineButton = (Button) findViewById(R.id.nine_button);
        divideButton = (Button) findViewById(R.id.divide_button);
        multiplyButton = (Button) findViewById(R.id.mul_button);
        minusButton = (Button) findViewById(R.id.minus_button);
        addButton = (Button) findViewById(R.id.plus_button);
        resetButton = (Button) findViewById(R.id.reset_button);
        equalButton = (Button) findViewById(R.id.equal_button);
        dotButton = (Button) findViewById(R.id.dot_button);
        deleteButton = (Button) findViewById(R.id.del_button);
        percentageButton = (Button) findViewById(R.id.per_button);
        signChangeButton = (Button) findViewById(R.id.changeSign_button);
        input = (TextView) findViewById(R.id.input_field);


        zeroButton.setOnClickListener(this);
        oneButton.setOnClickListener(this);
        twoButton.setOnClickListener(this);
        threeButton.setOnClickListener(this);
        fourButton.setOnClickListener(this);
        fiveButton.setOnClickListener(this);
        sixButton.setOnClickListener(this);
        sevenButton.setOnClickListener(this);
        eightButton.setOnClickListener(this);
        nineButton.setOnClickListener(this);
        divideButton.setOnClickListener(this);
        multiplyButton.setOnClickListener(this);
        minusButton.setOnClickListener(this);
        addButton.setOnClickListener(this);
        resetButton.setOnClickListener(this);
        equalButton.setOnClickListener(this);
        dotButton.setOnClickListener(this);
        deleteButton.setOnClickListener(this);
        percentageButton.setOnClickListener(this);
        signChangeButton.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
        String text = input.getText().toString();


        if (view.equals(zeroButton)) {
            String s = text + "0";
            input.setText(s);
        } else if (view.equals(oneButton)) {
            String s = text + "1";
            input.setText(s);
        } else if (view.equals(twoButton)) {
            String s = text + "2";
            input.setText(s);
        } else if (view.equals(threeButton)) {
            String s = text + "3";
            input.setText(s);
        } else if (view.equals(fourButton)) {
            String s = text + "4";
            input.setText(s);
        } else if (view.equals(fiveButton)) {
            String s = text + "5";
            input.setText(s);
        } else if (view.equals(sixButton)) {
            String s = text + "6";
            input.setText(s);
        } else if (view.equals(sevenButton)) {
            String s = text + "7";
            input.setText(s);
        } else if (view.equals(eightButton)) {
            String s = text + "8";
            input.setText(s);
        } else if (view.equals(nineButton)) {
            String s = text + "9";
            input.setText(s);
        } else if (view.equals(dotButton)) {
            int count = 0;
            if (text.contains(".")) {
                count++;
            }

            if (count == 0) {
                String s = text + ".";
                input.setText(s);
            }
        } else if (view.equals(signChangeButton))

        {

            if (text.length() > 0 && !text.equals(".")) {
                double value = Double.parseDouble(input.getText().toString());
                value = -value;
                input.setText(String.format("%.2f", value));
            }
        } else if (view.equals(multiplyButton))

        {
            if (text.length() > 0 && !text.equals(".")) {
                value1 = Double.parseDouble(input.getText().toString());
                operator = "*";
                input.setText("");
            }
        } else if (view.equals(addButton))

        {
            if (text.length() > 0 && !text.equals(".")) {
                value1 = Double.parseDouble(input.getText().toString());
                operator = "+";
                input.setText("");
            }
        } else if (view.equals(divideButton))

        {
            if (text.length() > 0 && !text.equals(".")) {
                value1 = Double.parseDouble(input.getText().toString());
                operator = "/";
                input.setText("");
            }
        } else if (view.equals(minusButton))

        {
            if (text.length() > 0 && !text.equals(".")) {
                value1 = Double.parseDouble(input.getText().toString());
                operator = "-";
                input.setText("");
            }
        } else if (view.equals(resetButton))
        {
            input.setText("");
        } else if (view.equals(deleteButton))

        {
            if (text.length() > 0) {
                StringBuilder sb = new StringBuilder(text);
                sb.deleteCharAt(sb.length() - 1);
                text = sb.toString();
                input.setText(text);
            }
        } else if (view.equals(percentageButton))

        {
            if (text.length() > 0 && !text.equals(".")) {
                value1 = Double.parseDouble(text);
                input.setText("");
                operator = "%";

            }

        } else if (view.equals(equalButton))

        {
            if (text.length() > 0 && !text.equals(".")) {

                 value2 = Double.parseDouble(input.getText().toString());
                if (operator.equals("+")) {
                    input.setText(String.format("%.2f", (value1 + value2)));
                    value1=value2=0;
                } else if (operator.equals("*")) {
                    input.setText(String.format("%.2f", (value1 * value2)));
                    value1=value2=0;
                } else if (operator.equals("-")) {
                    input.setText(String.format("%.2f", (value1 - value2)));
                    value1=value2=0;
                } else if (operator.equals("/")) {
                    input.setText(String.format("%.2f", (value1 / value2)));
                    value1=value2=0;
                } else if (operator.equals("%")) {
                    value2 = value2 / 100;
                    input.setText(String.format("%.2f", (value1 * value2)));
                }


            }


        }



    }

}
