package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class checkout extends AppCompatActivity {

    private Boolean debitChecked;
    LinearLayout debitButton, cashButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        debitButton = findViewById(R.id.debit_button);
        cashButton = findViewById(R.id.cash_button);
        debitChecked = true;
        updateButton();

        debitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!debitButton.isSelected()){
                    debitChecked = true;
                    updateButton();
                }
            }
        });

        cashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!cashButton.isSelected()){
                    debitChecked = false;
                    updateButton();
                }
            }
        });

        ImageView back = findViewById(R.id.imageView8);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(checkout.this, home_final.class));
                finish();
            }
        });
    }

    public void updateButton(){
        if (debitChecked){
            debitButton.setSelected(true);
            cashButton.setSelected(false);
        }
        else{
            debitButton.setSelected(false);
            cashButton.setSelected(true);
        }
    }
}