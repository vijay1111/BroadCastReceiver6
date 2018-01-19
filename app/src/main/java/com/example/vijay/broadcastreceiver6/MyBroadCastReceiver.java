package com.example.vijay.broadcastreceiver6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by vijay on 23/10/17.
 */

public class MyBroadCastReceiver extends BroadcastReceiver {
    Context context;
    @Override
    public void onReceive(Context context, Intent intent) {
        this.context=context;
        Toast.makeText(context, "braodcast Receiver threadid"+Thread.currentThread().getId(), Toast.LENGTH_SHORT).show();

    }
}
