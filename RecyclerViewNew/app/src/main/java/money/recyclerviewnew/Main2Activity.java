package money.recyclerviewnew;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView show;
    public static final String ID  = "bjbvjvd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        show=(TextView)findViewById(R.id.show);
        Intent intent =getIntent();
        int idd =intent.getIntExtra(ID,0);
        show.setText("Movie ID : "+String.valueOf(idd));
    }

    public static Intent getNewIntent(Context context , int id)
    {
        Intent intent = new Intent(context,Main2Activity.class);
        intent.putExtra(ID,id);
        return intent;
    }
}
