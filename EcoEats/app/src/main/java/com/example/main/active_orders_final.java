package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class active_orders_final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_orders_final);

        LinearLayout historyGroup, homeGroup, profileGroup;
        historyGroup = findViewById(R.id.history_group);
        homeGroup = findViewById(R.id.home_group);
        profileGroup = findViewById(R.id.profile_group);

        if (historyGroup != null) {
            historyGroup.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(active_orders_final.this, historyActivity.class));

                }
            });
        }
        if (profileGroup != null){
            profileGroup.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(active_orders_final.this, profile_final.class));
                    finish();
                }
            });
        }
        if (homeGroup != null) {
            homeGroup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(active_orders_final.this, home_final.class));
                    finish(); // Finish current activity
                }
            });
        }
    }
}
