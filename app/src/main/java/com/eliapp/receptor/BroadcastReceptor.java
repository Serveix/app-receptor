package com.eliapp.receptor;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;
import android.widget.Toast;

public class BroadcastReceptor extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Received successfully", Toast.LENGTH_SHORT).show();
    }
}
