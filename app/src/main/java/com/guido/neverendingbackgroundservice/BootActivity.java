package com.guido.neverendingbackgroundservice;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

// this activity is called only on boot. It's purpose is to start SensorService and then finish.
public class BootActivity extends AppCompatActivity {

    Intent mServiceIntent;
    private SensorService mSensorService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boot);

        mSensorService = new SensorService(this);
        mServiceIntent = new Intent(this, mSensorService.getClass());
        startService(mServiceIntent);
        finish();
    }


}

