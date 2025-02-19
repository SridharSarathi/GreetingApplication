package com.example.greeting

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import android.widget.Toast.*

class yReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("Test","Message Receiver")
        context?.let {

            Toast.makeText(it, "Broadcast Received", Toast.LENGTH_LONG).show()

        }
    }

}