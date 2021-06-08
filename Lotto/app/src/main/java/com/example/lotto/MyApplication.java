package com.example.lotto;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public void displayLog(){
        Log.e("Log Displayed",getProcessName()+">>>>");
    }
}
