package com.example.Tarea8YesseniaMateo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SubscriptionManager
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Integer.parseInt
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OnClick(view: View) {
        btncalcular.setOnClickListener() {}
        var n1: Double = ladoA.text.toString().toDouble()
        var n2: Double = ladoB.text.toString().toDouble()
        var total = ((n1!! * n1!!) + (n2!! * n2!!))
        var resultado: String = sqrt(total).toString()

        textView.setText(resultado)
    }
    }
