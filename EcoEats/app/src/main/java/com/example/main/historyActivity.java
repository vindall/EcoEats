package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class historyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        LinearLayout orderGroup, homeGroup, profileGroup;
        orderGroup = findViewById(R.id.order_group);
        homeGroup = findViewById(R.id.home_group);
        profileGroup = findViewById(R.id.profile_group);

        if (orderGroup != null) {
            orderGroup.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(historyActivity.this, active_orders_final.class));
                    finish();
                }
            });
        }
        if (profileGroup != null){
            profileGroup.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(historyActivity.this, profile_final.class));
                    finish();
                }
            });
        }
        if (homeGroup != null) {
            homeGroup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(historyActivity.this, home_final.class));
                    finish(); // Finish current activity
                }
            });
        }
    }
}