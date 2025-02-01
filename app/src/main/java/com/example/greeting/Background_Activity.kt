package com.example.greeting

import android.content.Intent
import android.graphics.Color.parseColor
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class Background_Activity : AppCompatActivity() {
      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.background_activity)

        var Back=findViewById<Button>(R.id.back)
        // Find all the buttons
        val title=findViewById<TextView>(R.id.titname)
        val redbtn= findViewById<Button>(R.id.redbuton)
        val yellowbtn = findViewById<Button>(R.id.yellow)
        val greenbtn = findViewById<Button>(R.id.green)
        val skybluebtn = findViewById<Button>(R.id.skyblue)
        val bluebtn = findViewById<Button>(R.id.blue)
        val pinkbtn = findViewById<Button>(R.id.pink)
        val orangebtn = findViewById<Button>(R.id.orange)
        val blackbtn= findViewById<Button>(R.id.black)
        val whitebtn=findViewById<Button>(R.id.white)
        val layout=findViewById<ConstraintLayout>(R.id.backgrounlayout)

        redbtn.setOnClickListener(){
            layout.setBackgroundColor(parseColor("#FF0000"))
        }
        yellowbtn.setOnClickListener() {
            layout.setBackgroundColor(parseColor("#FFFF00"))
        }
        greenbtn.setOnClickListener() {
            layout.setBackgroundColor(parseColor("#2cb505"))
        }
        skybluebtn.setOnClickListener() {
        layout.setBackgroundColor(parseColor("#0eedf8"))
        }
        bluebtn.setOnClickListener() {
            layout.setBackgroundColor(parseColor("#0941fc"))
        }
        pinkbtn.setOnClickListener() {
            layout.setBackgroundColor(parseColor("#e919f3"))
        }
        orangebtn.setOnClickListener() {
            layout.setBackgroundColor(parseColor("#ffa500"))
        }
            whitebtn.setOnClickListener() {
            layout.setBackgroundColor(parseColor("#FFFFFF"))
                title.setTextColor(parseColor("#000000"))
        }
        blackbtn.setOnClickListener() {

            layout.setBackgroundColor(parseColor("#000000"))
            title.setTextColor(parseColor("#FFFFFF"))
        }
        Back.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) // This starts the SecondActivity
            finish()
        }
    }
}