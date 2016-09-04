package com.example.money.fragmentsdemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class LoginFragement extends Fragment {
    private EditText username;
    private EditText passwd;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login_fragement, container, false);
        username = (EditText)view.findViewById(R.id.username);
        passwd = (EditText)view.findViewById(R.id.passwd);

        Button button = (Button)view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username1 =username.getText().toString();
                String pswd =passwd.getText().toString();
                Log.d("Money","Username : "+username1 + "Password : "+pswd);
            }
        });
        return view;
    }


}
