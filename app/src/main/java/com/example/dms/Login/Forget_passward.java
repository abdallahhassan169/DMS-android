package com.example.dms.Login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dms.HomeActivity.HomeActivity;
import com.example.dms.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Forget_passward extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_passward);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
    }

    public void onRegisterClick(View view) {
        Intent i = new Intent(this, log_in.class);
        startActivity(i);
    }

    public void cirSubmitButton(View view) {
        Intent i = new Intent(this, log_in.class);
        startActivity(i);
    }

    public void facebookBtn(View view) {
        Toast.makeText(this, "login in using facebook....", Toast.LENGTH_SHORT).show();

    }

    public void gmailBtn(View view) {
        Toast.makeText(this, "login in using gmail....", Toast.LENGTH_SHORT).show();

    }

    public void onForgotPwd(View view) {
    }
}