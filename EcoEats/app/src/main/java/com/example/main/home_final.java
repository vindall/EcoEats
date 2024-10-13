package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class home_final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_final);


        LinearLayout historyGroup, ordersGroup, profileGroup, searchBar;
        searchBar = findViewById(R.id.search_bar);
        historyGroup = findViewById(R.id.history_group);
        ordersGroup = findViewById(R.id.order_group);
        profileGroup = findViewById(R.id.profile_group);

        ImageView img1, img2, img3;
        img1 = findViewById(R.id.imageView31);
        img2 = findViewById(R.id.imageView32);
        img3 = findViewById(R.id.imageView33);

        img1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_final.this, details.class));
                finish();
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_final.this, details.class));
                finish();
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_final.this, details.class));
                finish();
            }
        });


        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(home_final.this, search_final.class));
                    finish();
                }
            });
        }
        if (historyGroup != null) {
            historyGroup.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(home_final.this, historyActivity.class));

                }
            });
        }
        if (profileGroup != null){
            profileGroup.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(home_final.this, profile_final.class));
                    finish();
                }
            });
        }
        if (ordersGroup != null) {
            ordersGroup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(home_final.this, active_orders_final.class));
                    finish(); // Finish current activity
                }
            });
        }
    }

    public void test(){
        Toast.makeText(home_final.this, "Authentication failed", Toast.LENGTH_SHORT).show();
    }
    public void test2(){
        Toast.makeText(home_final.this, "Authentication failed2", Toast.LENGTH_SHORT).show();
    }
}