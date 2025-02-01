package com.example.greeting

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
class MainActivity : ComponentActivity() {

    private var airplaneModeReceiver=AirplaneModeReceiver()
    private val testReceiver=TestReceiver()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerReceiver(airplaneModeReceiver, IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED))
//        registerReceiver(testReceiver, IntentFilter("ACTION_SEND"))

        setContentView(R.layout.activity_main)
        val textval=findViewById<TextView>(R.id.heading)
        val inputtext=findViewById<EditText>(R.id.inputtext)
        val submitbutton=findViewById<Button>(R.id.submit)
        var colors=findViewById<Button>(R.id.Colors)
        var basic=findViewById<Button>(R.id.androidbasics)
        var nav=findViewById<Button>(R.id.navigation)

        submitbutton.setOnClickListener{
            val entername=inputtext.text.trim().toString()
            val value="Hi \"${entername}\""
            textval.text=value
            inputtext.setText("")

        }
        colors.setOnClickListener(){
            val intent = Intent(this, Background_Activity::class.java)
            startActivity(intent) // This starts the SecondActivity

        }
        basic.setOnClickListener()
        {
            val intent=Intent(this,AndroidBasic_Activity::class.java)
            startActivity(intent)
          
        }
        nav.setOnClickListener()
        {
            val intent =Intent(this,MutlipageActivity::class.java)
            startActivity(intent)
        }


    }
    override fun onDestroy() {
        super.onDestroy()
        try {
            unregisterReceiver(airplaneModeReceiver)
            unregisterReceiver(testReceiver)
        } catch (e: IllegalArgumentException) {
            e.printStackTrace()
        }
    }
}
