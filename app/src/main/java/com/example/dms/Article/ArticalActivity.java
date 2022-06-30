package com.example.dms.Article;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.dms.R;

public class ArticalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artical);
        //hide toolbar
        getSupportActionBar().hide();
    }
}