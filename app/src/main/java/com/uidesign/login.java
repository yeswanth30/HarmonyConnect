package com.uidesign;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.uidesign.R;

public class login extends AppCompatActivity {

    private CheckBox checkBox;
    private TextView centerTextView;
    private TextView rightTextView,textView243,rightTextView637;
    ImageView roundedImageView12;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        roundedImageView12=findViewById(R.id.roundedImageView12);
        checkBox = findViewById(R.id.checkBox);
        centerTextView = findViewById(R.id.centerTextView);
        rightTextView637 = findViewById(R.id.rightTextView637);
        textView243=findViewById(R.id.textView243);

        checkBox.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

//                    centerTextView.setText("Checkbox is Checked");
                } else {

//                    centerTextView.setText("Checkbox is Unchecked");
                }
            }
        });

//        centerTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            }
//        });
//
//        rightTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            }
//        });


        textView243.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent165 = new Intent(login.this, signup.class);
                startActivity(intent165);
            }
        });

        rightTextView637.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent164 = new Intent(login.this, recoverpassword.class);
                startActivity(intent164);
            }
        });

        roundedImageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent163 = new Intent(login.this, subscribe.class);
                startActivity(intent163);
            }
        });

    }
}
