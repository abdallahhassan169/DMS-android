package com.example.dms.Meal_Suggestion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dms.R;

public class Meal_pg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_pg);
        getSupportActionBar().hide();
    }
}