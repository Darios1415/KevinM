package com.example.kevinm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Division : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_division)

        var num1 = findViewById<View>(R.id.div_num1) as EditText
        var num2 = findViewById<View>(R.id.div_num2) as EditText
        var calculo = findViewById<View>(R.id.div_dividir) as Button

        calculo.setOnClickListener(View.OnClickListener {
            var div_res = num1.text.toString().toInt() / num2.text.toString().toInt()
            var div_resultado: TextView = findViewById(R.id.div_res) as TextView
                div_resultado.text = div_res.toString()
        })

        var div_salir = findViewById<Button>(R.id.div_salir)
            div_salir.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}