package money.recyclerviewtest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

public class ShowActivity extends AppCompatActivity {
    private static final String number = "number";
    private static final String upto="upto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent intent = getIntent();
        int number3 = intent.getIntExtra(number,0);
        int upto3 = intent.getIntExtra(upto,0);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.tableRecyclerView);
      recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new TableAdapter(this,number3,upto3));
    }

    public static Intent getNewIntent(Context context,int number2,int upto2)
    {
        Intent intent = new Intent(context,ShowActivity.class);
        intent.putExtra(number,number2);

        intent.putExtra(upto,upto2);
        return intent;
    }
}
