package com.example.dms.PredictDiabetes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dms.R;

public class PredictDiabetes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
    }

    public void sendtoBredict(View view) {
        Toast.makeText(this, "Your data is Sending......", Toast.LENGTH_SHORT).show();
    }
}