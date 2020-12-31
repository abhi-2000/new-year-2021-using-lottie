package com.example.newyearanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    LottieAnimationView lottieAnimationView, lottie2;
    int i = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottie2 = findViewById(R.id.party);
        lottieAnimationView = findViewById(R.id.splashid);

    }
}