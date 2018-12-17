package com.example.ankita.showhide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    public void show(View view) {
imageView.setVisibility(View.VISIBLE);
    }

    public void hide(View view) {
        imageView.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       imageView  = findViewById(R.id.AnkuImageView);
    }


}
