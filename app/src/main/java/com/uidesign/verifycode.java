package com.uidesign;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.uidesign.R;

import org.w3c.dom.Text;

public class verifycode extends AppCompatActivity {

TextView loginButton123;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verifycode);
        loginButton123=findViewById(R.id.loginButton123);


        loginButton123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16 = new Intent(verifycode.this, changepassword.class);
                startActivity(intent16);
            }
        });


    }
}