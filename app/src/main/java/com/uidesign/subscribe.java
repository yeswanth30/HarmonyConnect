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

public class subscribe extends AppCompatActivity {

    private CheckBox checkBox;
    private TextView centerTextView;
    private TextView rightTextView, textView243, rightTextView637,loginButto444n;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subscribe);
        loginButto444n=findViewById(R.id.loginButto444n);

        loginButto444n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1633 = new Intent(subscribe.this, contactus.class);
                startActivity(intent1633);
            }
        });

    }
}