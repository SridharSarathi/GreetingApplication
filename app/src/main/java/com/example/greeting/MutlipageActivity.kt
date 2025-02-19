package com.example.greeting

//import android.net.Uri
import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.content.ContextCompat
import com.example.greeting.R.id.webView

class MutlipageActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.multipage)
        var Ybtn=findViewById<ImageButton>(R.id.youtube)
        var Chbtn=findViewById<ImageButton>(R.id.chrome)
        var Embtn=findViewById<ImageButton>(R.id.email)
        var chatbtn=findViewById<ImageButton>(R.id.chatgpt)

         //webView
       val webView: WebView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
        webView.visibility = WebView.VISIBLE



        Chbtn.setOnClickListener()
        {
//            Intent(Intent.ACTION_MAIN).also {
//                it.`package`="com.android.chrome"
//                try{
//                    startActivity(it)
//                }
//                catch(anf:ActivityNotFoundException)
//                {
//                    anf.printStackTrace()
//                }
//            }
            visibilityhide()
            webView.loadUrl( "https://www.google.com/")
        }
        Embtn.setOnClickListener {
//            val intent = Intent(Intent.ACTION_MAIN)
//            intent.addCategory(Intent.CATEGORY_APP_EMAIL)
//            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//            startActivity(intent)
            visibilityhide()
            webView.loadUrl( "https://mail.google.com/mail/u/0/")
        }
        chatbtn.setOnClickListener {
//            visibilityhide()
            webView.loadUrl( "https://chat.openai.com/")
//            var Layout=R.layout.multipage
//            Layout.visibility=View.GONE




        }

        Ybtn.setOnClickListener()
        {
//            Intent(Intent.ACTION_MAIN).also{
//            it.`package`="com.google.android.youtube"
////                if(it.resolveActivity(packageManager)!=null) {
////                    startActivity(it)
////                }
////                else{
////                    println("no invoice")
////                }
//                try{ startActivity(it)
//                }
//                catch (e:ActivityNotFoundException)
//                {
//                    e.printStackTrace()
//                }
//            }d

            visibilityhide()


            webView.loadUrl("https://www.youtube.com")


//            var intent=Intent(this,WebViewActivity::class.java)
//            Log.d("hi ", intent.toString()+"")
//            startActivity(intent)

        }
    }


    fun visibilityhide()
    {
        var listofdesign= listOf(findViewById<ImageButton>(R.id.email),
            findViewById<ImageButton>(R.id.chrome),
            findViewById<ImageButton>(R.id.youtube),
            findViewById<ImageButton>(R.id.chatgpt),
            findViewById<TextView>(R.id.navigation)
        )
        for(i in listofdesign)
        {
            i.visibility=View.GONE
        }
    }

}