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

public class recoverpassword extends AppCompatActivity {

   TextView loginButton456;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recoverpassword);
        loginButton456=findViewById(R.id.loginButton456);

        loginButton456.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16 = new Intent(recoverpassword.this, verifycode.class);
                startActivity(intent16);
            }
        });
    }
    }