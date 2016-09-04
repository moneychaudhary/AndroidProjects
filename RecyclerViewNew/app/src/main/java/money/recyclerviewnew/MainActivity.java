package money.recyclerviewnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewMovieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewMovieList =(RecyclerView)findViewById(R.id.recyclerView);
        recyclerViewMovieList.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewMovieList.setAdapter(new RecyclerViewAdapter(this));

    }
}
