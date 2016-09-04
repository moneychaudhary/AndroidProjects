package money.recyclerview2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    private static final String  MoiveId ="grrrrrrrrr";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent =getIntent();
        int id = intent.getIntExtra(MoiveId,0);
        imageView =(ImageView)findViewById(R.id.show_image);
        imageView.setBackgroundResource(id);


    }

    public static Intent getNewIntent(Context context , int Id)
    {
        Intent intent = new Intent(context,Main2Activity.class);
        intent.putExtra(MoiveId,Id);
        return intent;
    }
}
