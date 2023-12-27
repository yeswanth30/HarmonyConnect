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

public class contactus extends AppCompatActivity {

    private CheckBox checkBox;
    private TextView centerTextView,loginButton444444;
    private TextView rightTextView,textView243,rightTextView637;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.contactus);
        loginButton444444=findViewById(R.id.loginButton444444);
        loginButton444444.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16334 = new Intent(contactus.this, feedback.class);
                startActivity(intent16334);
            }
        });


    }}