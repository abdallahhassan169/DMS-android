package com.example.dms.Login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.example.dms.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Log_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_up);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
    }

    public void onLoginClick(View view) {
        Toast.makeText(this, "Back to home ... ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, log_in.class);
        startActivity(i);
    }

    public void cirRegisterButton(View view) {
        Toast.makeText(this, "Register Successfully... ", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(this, log_in.class);
        startActivity(i);
    }
}