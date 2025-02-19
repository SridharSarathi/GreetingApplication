package com.example.greeting

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.greeting.databinding.ActivityConfigurationChangesBinding

class ConfigurationChanges : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        var binds=ActivityConfigurationChangesBinding.inflate(layoutInflater)
        setContentView(binds.root)

        var count=0;
        binds.incrementbutton.setOnClickListener()
        {

            binds.number.setText(count++.toString());
        }

        binds.decrementbutton.setOnClickListener()
        {
            binds.number.setText(count--.toString());
        }
    }
}