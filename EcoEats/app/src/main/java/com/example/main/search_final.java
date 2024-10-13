package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class search_final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_final);

        LinearLayout historyGroup, ordersGroup, homeGroup, profileGroup;
        profileGroup = findViewById(R.id.profile_group);
        historyGroup = findViewById(R.id.history_group);
        ordersGroup = findViewById(R.id.order_group);
        homeGroup = findViewById(R.id.home_group);

        if (profileGroup != null) {
            profileGroup.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(search_final.this, profile_final.class));
                    finish();
                }
            });
        }

        if (historyGroup != null) {
            historyGroup.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(search_final.this, historyActivity.class));

                }
            });
        }
        if (homeGroup != null){
            homeGroup.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(search_final.this, home_final.class));
                    finish();
                }
            });
        }
        if (ordersGroup != null) {
            ordersGroup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(search_final.this, active_orders_final.class));
                    finish(); // Finish current activity
                }
            });
        }
    }
}