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

public class signup extends AppCompatActivity {

    private CheckBox checkBox;
    private TextView centerTextView,textView2766;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        checkBox = findViewById(R.id.checkBox1);
        centerTextView = findViewById(R.id.centerTextView1);
        textView2766=findViewById(R.id.textView2766);

        checkBox.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                   // centerTextView.setText("Checkbox is Checked");
                } else {

                   // centerTextView.setText("Checkbox is Unchecked");
                }
            }
        });

        centerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        textView2766.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16 = new Intent(signup.this, login.class);
                startActivity(intent16);
            }
        });

    }
}
