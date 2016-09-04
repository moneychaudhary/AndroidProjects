package com.example.money.implicatintentsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view)
    {
        Intent intent = null;
      if(view.getId()==R.id.camera)
      {
          intent = new Intent()

      }
      else if(view.getId()==R.id.mail)
      {

      }
      else if(view.getId()==R.id.map)
      {

      }
    }
}
