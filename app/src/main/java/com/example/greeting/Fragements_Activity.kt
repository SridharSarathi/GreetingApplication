package com.example.greeting

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.greeting.databinding.ActivityFragementsBinding

class Fragements_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

       var binds=ActivityFragementsBinding.inflate(layoutInflater)
        setContentView(binds.root)
        binds.frag1.setOnClickListener (){
            onresumechange(Fragment1())
        }
        binds.frag2.setOnClickListener() {
            onresumechange(Fragment2())
        }
    }
    private fun onresumechange(fragement:Fragment)
    {
        var fragmentManager=supportFragmentManager
         fragmentManager.beginTransaction().replace(R.id.fragementscontainer,fragement).commit()
    }
}