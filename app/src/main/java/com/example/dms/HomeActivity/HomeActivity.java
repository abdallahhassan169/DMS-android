package com.example.dms.HomeActivity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.dms.AboutApplication.AboutApplication;
import com.example.dms.Article.ArticalActivity;
import com.example.dms.PredictDiabetes.Clustring;
import com.example.dms.PredictDiabetes.PredictDiabetes;
import com.example.dms.Meal_Suggestion.Suggest_meal_Activity;
import com.example.dms.Medical_Reminder.Medicien_Reminder_Activity;
import com.example.dms.R;
import com.example.dms.Training.Training;
import com.example.dms.profile.ProfileAcitvity;

public class HomeActivity extends AppCompatActivity  {
    LinearLayout artical ,profile, meal,medicinereminder,check,training,cluster,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
        /*----------- take an  objcet form the liner layout ----------*/
         artical=findViewById(R.id.artical);
         profile=findViewById(R.id.profile);
         meal=findViewById(R.id.meal);
         medicinereminder=findViewById(R.id.medicianReminder);
         check=findViewById(R.id.check);
         training=findViewById(R.id.training);
         cluster=findViewById(R.id.cluster);
         about=findViewById(R.id.about);
         about.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i=new Intent(HomeActivity.this, AboutApplication.class);
                 startActivity(i);
                 overridePendingTransition(R.anim.zoomin,R.anim.goinsplash);


             }
         });
         cluster.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i=new Intent(HomeActivity.this, Clustring.class);
                 startActivity(i);
                 overridePendingTransition(R.anim.zoomin,R.anim.goinsplash);


             }
         });
         training.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i=new Intent(HomeActivity.this, Training.class);
                 startActivity(i);
                 overridePendingTransition(R.anim.zoomin,R.anim.goinsplash);

             }
         });
/*parcode */
         /*------------- Make an setOnClickListener ----------------*/
        artical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent i=new Intent(HomeActivity.this, ArticalActivity.class);

                startActivity(i);
                overridePendingTransition(R.anim.zoomin,R.anim.goinsplash);

            }
        });
        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this, Suggest_meal_Activity.class);
                startActivity(i);
                overridePendingTransition(R.anim.zoomin,R.anim.goinsplash);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i=new Intent(HomeActivity.this, ProfileAcitvity.class);
                    startActivity(i);
                overridePendingTransition(R.anim.zoomin,R.anim.goinsplash);

            }
        });
        medicinereminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Medicien_Reminder_Activity.class);
                startActivity(i);
                overridePendingTransition(R.anim.zoomin,R.anim.goinsplash);

            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this, PredictDiabetes.class);
            startActivity(i);
                overridePendingTransition(R.anim.zoomin,R.anim.goinsplash);

            }
        });


    }




}