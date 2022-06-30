package com.example.dms.Spalsh_Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.example.dms.Login.log_in;
import com.example.dms.R;

public class slider_activity extends AppCompatActivity {
    ViewPager viewPager;
    Button btnNext;
    AdapteSlider adapteSlider;
    int[] layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
        viewPager = findViewById(R.id.pager);
        btnNext = findViewById(R.id.next);
        layout = new int[]{
                R.layout.slider1, R.layout.slider2, R.layout.slider3,R.layout.slider4
        };

        adapteSlider = new AdapteSlider(this, layout);
        viewPager.setAdapter(adapteSlider);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewPager.getCurrentItem() + 1 < layout.length) {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                } else {
                    //go to login activity
                    Animation animation= AnimationUtils.loadAnimation(slider_activity.this,R.anim.goinsplash);

                    Intent i = new Intent(slider_activity.this, log_in.class);
                    startActivity(i);
                     overridePendingTransition(R.anim.zoomin,R.anim.goinsplash);
                    btnNext.startAnimation(animation);





                }
            }
        });
        viewPager.addOnPageChangeListener(viewpageChangeListener);


    }

    ViewPager.OnPageChangeListener viewpageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            if (position == layout.length - 1) {
                btnNext.setText(" Continue ");


            } else {


            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }

    };
}
