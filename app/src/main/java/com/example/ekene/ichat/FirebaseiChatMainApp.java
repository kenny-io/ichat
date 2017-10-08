package com.example.ekene.ichat;

import android.app.Application;

/**
 * Created by EKENE on 9/21/2017.
 */

public class FirebaseiChatMainApp  extends Application{

    private static boolean sIsChatActivityOpen  =   false;

    public static boolean isChatActivityOpen(){

        return sIsChatActivityOpen;
    }

    public static void setChatActivityOpen(boolean  isChatActivityOpen){

        FirebaseiChatMainApp.sIsChatActivityOpen = isChatActivityOpen;
    }

    @Override
    public void onCreate(){
        super.onCreate();
    }

}
