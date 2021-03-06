package com.tatvasoft.tatvasoftassignment5;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.annotation.Nullable;

import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN);
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                Intent in=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(in);
                finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();
    }
}
