package com.example.dms.AboutApplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.dms.R;

public class AboutApplication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_application);
        getSupportActionBar().hide();

    }
}