package com.example.kevinm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Multiplicacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplicacion)

        var num1 = findViewById<View>(R.id.mult_num1) as EditText
        var num2 = findViewById<View>(R.id.mult_num2) as EditText
        var calculo = findViewById<View>(R.id.mult_multiplicar) as Button

        calculo.setOnClickListener(View.OnClickListener {
            var mult_res = num1.text.toString().toInt() * num2.text.toString().toInt()
            var mult_resultado: TextView = findViewById(R.id.mult_res) as TextView
                mult_resultado.text = mult_res.toString()
        })

        var mult_salir = findViewById<Button>(R.id.mult_salir)
            mult_salir.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}