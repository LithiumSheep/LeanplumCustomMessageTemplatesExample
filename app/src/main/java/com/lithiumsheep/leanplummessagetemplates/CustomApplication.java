package com.lithiumsheep.leanplummessagetemplates;

import android.app.Application;

public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // with minifyEnabled true in build.gradle, we don't even reach this line
        com.leanplum.messagetemplates.MessageTemplates.register(this);
    }
}
