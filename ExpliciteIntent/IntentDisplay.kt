package com.example.myday1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

public class IntentDisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Myday1)
        setContentView(R.layout.intent_display)

        var res = findViewById<TextView>(R.id.res)

        var t1 = intent.getStringExtra("name")
        var t2 = intent.getStringExtra("pass")
        var t3 = intent.getStringExtra("email")
        var t4 = intent.getStringExtra("date")
        var t5 = intent.getStringExtra("phone")
        var option = intent.getStringExtra("course")

        res.text = " Entered Values are : \n " +
                "Name : ${t1} \n" +
                "Password : ${t2} \n" +
                "Email : ${t3} \n" +
                "Date : ${t4} \n" +
                "Phone No. : ${t5} \n " +
                "Course : ${option}"
    }


    }
