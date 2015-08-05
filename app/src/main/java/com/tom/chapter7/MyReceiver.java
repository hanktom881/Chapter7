package com.tom.chapter7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("MyReceiver", "onReceive");
        // TODO: This method is called when the BroadcastReceiver is receiving
//        Log.d("MyReceiver", intent.getData().toString());
        String state = intent.getExtras().getString(TelephonyManager.EXTRA_STATE);
        Log.d("MyReceiver", state);
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");
    }
}
