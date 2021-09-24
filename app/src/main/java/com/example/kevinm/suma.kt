package com.example.kevinm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class suma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma)

        var num1 = findViewById<View>(R.id.sum_num1) as EditText
        var num2 = findViewById<View>(R.id.sum_num2) as EditText
        var calculo = findViewById<View>(R.id.sum_sumar) as Button

        calculo.setOnClickListener(View.OnClickListener {
            var sum_res = num1.text.toString().toInt() + num2.text.toString().toInt()
            var sum_resultado: TextView = findViewById(R.id.sum_res) as TextView
                sum_resultado.text = sum_res.toString()
        })

        var sum_salir = findViewById<Button>(R.id.sum_salir)
        sum_salir.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}