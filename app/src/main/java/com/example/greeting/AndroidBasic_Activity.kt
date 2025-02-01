package com.example.greeting
import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import android.net.Uri
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.AlertDialog

class AndroidBasic_Activity:ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        var intent:Intent
        setContentView(R.layout.androidbasics)
        var alert=findViewById<Button>(R.id.alert)
        var explictbtn=findViewById<Button>(R.id.explict)
        var sendmail=findViewById<Button>(R.id.sendmail)
        var implictbtn=findViewById<Button>(R.id.implict)

        println("onCreate() Screen visible")
        Toast.makeText(this, "Life Cycle is Running ", Toast.LENGTH_LONG).show()

        sendmail.setOnClickListener()
        {
            intent=Intent(Intent.ACTION_SEND).apply {
                    type="text/plain"
                putExtra(Intent.EXTRA_EMAIL, arrayOf("january@gmail.com"))
                putExtra(Intent.EXTRA_SUBJECT, "Email subject")
                putExtra(Intent.EXTRA_TEXT, "Email message text")
            }
            startActivity(intent)
            // Create appChooser
            intent=Intent(Intent.ACTION_SEND)
            val chooser=Intent.createChooser(intent,null)
            startActivity(chooser)
        }
        explictbtn.setOnClickListener()
            {
                 intent=Intent(this,Background_Activity::class.java)
                startActivity(intent)
                Toast.makeText(this,"Clicked By Explicit Intent",Toast.LENGTH_LONG).show()
            }
        implictbtn.setOnClickListener()
        {
           intent=Intent(Intent.ACTION_DIAL)
            intent.data=Uri.parse("tel:675326830932")
           startActivity(intent)
//            val webIntent: Intent = Uri.parse("https://www.android.com").let { webpage ->
//                Intent(Intent.ACTION_VIEW, webpage)
//
//            }
//            startActivity(webIntent)

        }


    }


    override fun onStart() {
        super.onStart()
        println("onStart() Screen visible")
    }

    override fun onResume() {
        super.onResume()
        println("onResume Screen visible")
    }

    override fun onPause() {
        super.onPause()
        println("onPause() Screen not visible or another app running in foreground")
    }

    override fun onStop() {
        super.onStop()
        println("onStop() Screen not visible or another app running in foreground")
    }
    override fun onRestart() {
        super.onRestart()
        println("onRestart() user return to activity")
    }
    override fun onDestroy()
    {
        super.onDestroy()
        println("onDestroy() Activity destroyed")
    }
}