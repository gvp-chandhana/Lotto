package com.example.lotto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        Log.e("Create","Create Called");


       /* new Handler(Looper.myLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intent.ACTION_SEND);
                startActivity(intent);
               // finish();
            }
        },2000);*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("start","Start Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Pause","Pause Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Restart","Restart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Resume","Resume Called");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Destroy","Destroy Called");
    }
}