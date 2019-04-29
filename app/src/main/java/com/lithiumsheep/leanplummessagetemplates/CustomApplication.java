package com.lithiumsheep.leanplummessagetemplates;

import android.app.Application;

public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        com.leanplum.messagetemplates.MessageTemplates.register(this);
    }
}
