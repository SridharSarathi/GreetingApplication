package com.example.greeting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class Fragment2 : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        Toast.makeText(Fragment1,"this",Toast.LENGTH_LONG).show()
        return inflater.inflate(R.layout.fragment_2, container, false)
    }


}