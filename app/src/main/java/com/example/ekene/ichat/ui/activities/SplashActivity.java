package com.example.ekene.ichat.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ekene.ichat.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.Transaction;

import java.util.logging.Handler;

/**
 * Created by EKENE on 9/23/2017.
 */

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_MS =   2000;
    //private Handler
    private Runnable mRunnable;
    private android.os.Handler  mHandler;

    @Override
    protected void onCreate (Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_splash);

        mHandler = new android.os.Handler();
        mRunnable = new Runnable() {
            @Override
            public void run() {

                if (FirebaseAuth.getInstance().getCurrentUser() != null){
                    UserListingActivity.startActivity(SplashActivity.this);
                }else

                LoginActivity.startIntent(SplashActivity.this);
                finish();
            }

        };


    }
}
