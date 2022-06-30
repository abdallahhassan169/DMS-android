package com.example.dms.Spalsh_Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dms.R;

public class splashScreen extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spalshscreen);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
        new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent i = new Intent(splashScreen.this,slider_activity.class);
                 startActivity(i);
                 finish();
              }
         },4100);
    }
}
