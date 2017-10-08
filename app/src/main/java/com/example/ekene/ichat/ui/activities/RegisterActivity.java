package com.example.ekene.ichat.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.ekene.ichat.R;
import com.example.ekene.ichat.ui.fragments.RegisterFragment;

/**
 * Created by EKENE on 9/23/2017.
 */

public class RegisterActivity extends AppCompatActivity {
    private Toolbar mToolbar;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        bindViews();
        init();
    }

    private void bindViews() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
    }

    private void init() {
        // set the toolbar
        setSupportActionBar(mToolbar);

        // set the register screen fragment
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_register,
                RegisterFragment.newInstance(),
                RegisterFragment.class.getSimpleName());
        fragmentTransaction.commit();
    }

}


//public class RegisterActivity extends AppCompatActivity {
//
//    private Toolbar mToolbar;
//
//    private static void startIntent(Context context){
//        Intent intent = new Intent(context, RegisterActivity.class);
//        context.startActivity(intent);
//    }
//
//
//    @Override
//    protected void onCreate (Bundle SavedInstanceState){
//        super.onCreate(SavedInstanceState);
//        setContentView(R.layout.activity_register);
//        bindViews();
//        init();
//    }
//    private void bindViews(){
//
//        mToolbar = (Toolbar) findViewById(R.id.toolbar);
//    }
//
//    private void init(){
//        setSupportActionBar(mToolbar);
//
//        FragmentTransaction fragmentTransaction =   getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.frame_layout_register,
//                RegisterFragment.newInstance(),
//                RegisterFragment.class.getSimpleName());
//        fragmentTransaction.commit();
//    }
//}
