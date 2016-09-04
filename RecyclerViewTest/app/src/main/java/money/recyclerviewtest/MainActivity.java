package money.recyclerviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button submitButton;
    private EditText number;
    private EditText upto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton=(Button)findViewById(R.id.submit_button);
        number=(EditText)findViewById(R.id.number);
        upto=(EditText)findViewById(R.id.upto);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.equals(submitButton)) {


            int value1=0;
            int value2=0;
            String number1 = number.getText().toString();
            String upto1 = upto.getText().toString();

            if (number1.equals(null)||upto1.equals(null))
            {
                value1=0;
                value2=0;
            }
            else {
                value1=Integer.parseInt(number1);
                value2=Integer.parseInt(upto1);
            }


            Intent intent = ShowActivity.getNewIntent(this, value1, value2);
            startActivity(intent);

        }

    }
}
