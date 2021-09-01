package com.hxx.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button login_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login_in = findViewById(R.id.login_in);
        login_in.setOnClickListener(new MyOnClickListener());
    }


    class MyOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            if(username.getText().toString().isEmpty() ||password.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this,"invalid input!!!Please retry it.",Toast.LENGTH_LONG).show();
                return;
            }
            Toast.makeText(MainActivity.this,"Welcome,"+username.getText(),Toast.LENGTH_SHORT).show();
        }

    }




}
