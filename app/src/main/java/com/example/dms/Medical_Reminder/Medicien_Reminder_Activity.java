package com.example.dms.Medical_Reminder;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.example.dms.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Medicien_Reminder_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicien_reminder);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
    }

    public void addNewMedicine(View view) {
        Toast.makeText(this, "It has been successfully added ", Toast.LENGTH_SHORT).show();
    }
}