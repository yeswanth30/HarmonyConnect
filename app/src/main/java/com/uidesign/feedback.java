package com.uidesign;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class feedback extends AppCompatActivity {
    ImageView star1, star2, star3, star4, star5;
    TextView loginButton3333;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);

        star1 = findViewById(R.id.star1);
        star2 = findViewById(R.id.star2);
        star3 = findViewById(R.id.star3);
        star4 = findViewById(R.id.star4);
        star5 = findViewById(R.id.star5);

        loginButton3333 = findViewById(R.id.loginButton3333);

        // Set click listeners for stars
        star1.setOnClickListener(this::onStarClick);
        star2.setOnClickListener(this::onStarClick);
        star3.setOnClickListener(this::onStarClick);
        star4.setOnClickListener(this::onStarClick);
        star5.setOnClickListener(this::onStarClick);

        loginButton3333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the action when the "Submit Now" button is clicked
                // For example, navigate to another activity
                Intent intent = new Intent(feedback.this, login.class);
                startActivity(intent);
            }
        });
    }

    public void onStarClick(View view) {
        ImageView clickedImageView = (ImageView) view;
        int starValue = Integer.parseInt(clickedImageView.getTag().toString());
        toggleStarState(clickedImageView, starValue);
    }

    private void toggleStarState(ImageView imageView, int starNumber) {
        // Check if the star is currently filled
        boolean isStarFilled = isStarFilled(imageView);

        // Change the star icon based on the current state
        imageView.setImageResource(isStarFilled ? R.drawable.ic_star_empty : R.drawable.ic_star_filled);

        // Update the state of the star
        imageView.setTag(isStarFilled ? 0 : 1);

        // Perform any other actions based on the star click if needed
    }

    private boolean isStarFilled(ImageView imageView) {
        Object tag = imageView.getTag();
        if (tag != null) {
            if (tag instanceof Integer) {
                return (int) tag == 1;
            } else if (tag instanceof String) {
                try {
                    return Integer.parseInt((String) tag) == 1;
                } catch (NumberFormatException e) {
                    // Handle the exception or log an error
                    return false;
                }
            }
        }
        return false;
    }
}



