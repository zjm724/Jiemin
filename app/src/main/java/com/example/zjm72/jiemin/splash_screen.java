package com.example.zjm72.jiemin;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.GridLayoutAnimationController;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.*;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);




        View decorView = getWindow().getDecorView();
// Hide both the navigation bar and the status bar.
// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
// a general rule, you should design your app to hide the status bar whenever you
// hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);


        Thread MyThread = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(5000);


                    TextView textView = (TextView) findViewById(R.id.welcome_screen_text);

                    ImageView imageView = (ImageView) findViewById(R.id.signature_image);




                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                    startActivity(intent);

                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        MyThread.start();
    }
}
