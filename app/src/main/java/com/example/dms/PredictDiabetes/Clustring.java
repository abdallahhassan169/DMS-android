package com.example.dms.PredictDiabetes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dms.R;


public class Clustring extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clustring);
        getSupportActionBar().hide();

    }

    public void sendtoculstring(View view) {
        Toast.makeText(this, "Your Data is Sending ......", Toast.LENGTH_SHORT).show();
    }
}