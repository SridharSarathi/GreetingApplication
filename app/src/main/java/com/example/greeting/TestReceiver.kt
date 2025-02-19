package com.example.greeting

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class TestReceiver :BroadcastReceiver()
{
    override fun onReceive(context: Context?, intent: Intent?) {
        println("Entered ")
        if(intent?.action=="ACTION_SEND")
        {
            Log.d("Test Receiver ","Broadcast Received")

        }
    }
}