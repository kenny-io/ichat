package com.example.ekene.ichat.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.ekene.ichat.R;
import com.example.ekene.ichat.ui.fragments.ChatFragment;
import com.example.ekene.ichat.utils.Constants;

/**
 * Created by EKENE on 9/23/2017.
 */

public class ChatActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    public static void startActivity(Context context,
                                     String receiver,
                                     String receiverUid,
                                     String firebaseToken){

        Intent intent = new Intent(context, ChatActivity.class);
        intent.putExtra(Constants.ARG_RECEIVER, receiver);
        intent.putExtra(Constants.ARG_RECEIVER_UID, receiverUid);
        intent.putExtra(Constants.ARG_FIREBASETOKEN, firebaseToken);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate (Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_chat);
        bindViews();
        init();
    }
    private void bindViews(){

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
    }

    private void init(){
        setSupportActionBar(mToolbar);

        mToolbar.setTitle((CharSequence) getIntent().getExtras().get(Constants.ARG_RECEIVER));

        FragmentTransaction fragmentTransaction =   getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_chat,
                ChatFragment.newInstance(
                        getIntent().getExtras().get(Constants.ARG_RECEIVER),
                        getIntent().getExtras().get(Constants.ARG_RECEIVER_UID),
                        getIntent().getExtras().get(Constants.ARG_FIREBASETOKEN)),
                ChatFragment.class.getSimpleName());
        fragmentTransaction.commit();
    }

    }

