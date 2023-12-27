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

public class changepassword extends AppCompatActivity {

    TextView loginButton876;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.changepassword);
        loginButton876=findViewById(R.id.loginButton876);


        loginButton876.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16 = new Intent(changepassword.this, login.class);
                startActivity(intent16);
            }
        });


    }
}