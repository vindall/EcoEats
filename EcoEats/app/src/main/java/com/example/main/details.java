package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageButton purchase;
        LinearLayout historyGroup, ordersGroup, homeGroup, profileGroup;
        profileGroup = findViewById(R.id.profile_group);
        historyGroup = findViewById(R.id.history_group);
        ordersGroup = findViewById(R.id.order_group);
        homeGroup = findViewById(R.id.home_group);
        purchase = findViewById(R.id.purchase_button);


        if (purchase != null) {
            purchase.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(details.this, checkout.class));
                    finish();
                }
            });
        }

        if (profileGroup != null) {
            profileGroup.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(details.this, profile_final.class));
                    finish();
                }
            });
        }

        if (historyGroup != null) {
            historyGroup.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(details.this, historyActivity.class));

                }
            });
        }
        if (homeGroup != null){
            homeGroup.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(details.this, home_final.class));
                    finish();
                }
            });
        }
        if (ordersGroup != null) {
            ordersGroup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(details.this, active_orders_final.class));
                    finish(); // Finish current activity
                }
            });
        }
    }
}