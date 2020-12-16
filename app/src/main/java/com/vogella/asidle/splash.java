package com.vogella.asidle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {
    ImageView logo,splashImg;
    TextView name;
    LottieAnimationView lottieAnimationView;
    long Delay = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Timer timer = new Timer();

        logo = findViewById(R.id.logo);
        name = findViewById(R.id.title);
        lottieAnimationView = findViewById(R.id.lottie_animation);

        logo.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        name.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

        //Timer task
        TimerTask Showsplash = new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent intent = new Intent(splash.this,MainActivity.class);
                startActivity(intent);
            }
        };

        //start the timer
        timer.schedule(Showsplash, Delay);
    }
}