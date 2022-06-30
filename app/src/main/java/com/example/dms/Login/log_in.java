package com.example.dms.Login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import com.example.dms.HomeActivity.HomeActivity;
import com.example.dms.R;

public class log_in extends AppCompatActivity {
Button login ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
        login =findViewById(R.id.cirLoginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(log_in.this, HomeActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.zoomin,R.anim.goinsplash);
            }
        });
        Animation animation= AnimationUtils.loadAnimation(log_in.this,R.anim.zoomin);
        login.startAnimation(animation);
    }



    public void onRegisterClick(View view) {
        Toast.makeText(this, "register on gointing....", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(log_in.this, Log_up.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoomin,R.anim.goinsplash);

    }

    public void facebookBtn(View view) {
        Toast.makeText(this, "login in using facebook....", Toast.LENGTH_SHORT).show();
    }

    public void gmailBtn(View view) {
        Toast.makeText(this, "login in using gmail....", Toast.LENGTH_SHORT).show();
    }

    public void registerClick(View view) {
        Toast.makeText(this, "register on gointing....", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(log_in.this,Log_up.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoomin,R.anim.goinsplash);

    }

    public void onForgotPwd(View view) {
        Intent i =new Intent(this,Forget_passward.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoomin,R.anim.goinsplash);

    }
}