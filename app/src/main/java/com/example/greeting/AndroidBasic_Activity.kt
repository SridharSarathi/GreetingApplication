package com.example.greeting
import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.AlertDialog
import com.example.greeting.databinding.AndroidbasicsBinding
import kotlin.math.log

class AndroidBasic_Activity:ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.androidbasics)
        var intent:Intent
        var frag=findViewById<Button>(R.id.fragements)

        var alert=findViewById<Button>(R.id.alert)
        var explictbtn=findViewById<Button>(R.id.explict)
        var sendmail=findViewById<Button>(R.id.sendmail)
        var implictbtn=findViewById<Button>(R.id.implict)
//        var binds=AndroidbasicsBinding.inflate(layoutInflater)
        var config=findViewById<Button>(R.id.configbtn)
        println("onCreate() Screen visible")
        Toast.makeText(this, "Life Cycle is Running ", Toast.LENGTH_LONG).show()
        config.setOnClickListener()
        {
            Log.d("Testing","Entered")
            var intent=Intent(this,ConfigurationChanges::class.java)
            startActivity(intent)
//            Toast.makeText(AndroidBasic_Activity,"Clicked",Toast.LENGTH_LONG).show()
        }
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
        frag.setOnClickListener {
            var intent=Intent(this,Fragements_Activity::class.java)
            startActivity(intent)
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