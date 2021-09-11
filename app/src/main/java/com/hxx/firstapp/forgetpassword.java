package com.hxx.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class forgetpassword extends AppCompatActivity{

    //prepare necessary components
    Button back,send;
    Intent homepage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget_password);
        back = findViewById(R.id.back);
        send = findViewById(R.id.send);
    }

    // click and back function
    public void ClickSend(View view){
        Toast.makeText(forgetpassword.this,"Please reset your password by email.",Toast.LENGTH_LONG).show();
    }

    public void ClickBack(View view){
        homepage = new Intent (forgetpassword.this,MainActivity.class);
        startActivity(homepage);
    }
}
