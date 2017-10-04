package com.guido.neverendingbackgroundservice;

/**
 * Created by Guido on 02/10/2017.
 */

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Guido on 16/08/2017.
 */

public class BootReceiver extends BroadcastReceiver {

    SharedPreferences prefs;

    @Override
    public void onReceive(Context context, Intent intent)
    {
        // Log.i(SensorRestarterBroadcastReceiver.class.getSimpleName(), "Called after boot!!!!");
        // context.startService(new Intent(context, SensorService.class));

        Intent myStarterIntent = new Intent(context, BootActivity.class);
        myStarterIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(myStarterIntent);
    }

    static String toasttext;

    public static void ShowToast(final Context context, String text){

        toasttext = text;
        Handler handler = new Handler(Looper.getMainLooper());

        handler.post(new Runnable() {

            @Override
            public void run() {
                Toast.makeText(context,toasttext,Toast.LENGTH_SHORT).show();
            }

        });
    }
}
