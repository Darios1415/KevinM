package com.example.kevinm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Resta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resta)

        var num1 = findViewById<View>(R.id.rest_num1) as EditText
        var num2 = findViewById<View>(R.id.rest_num2) as EditText
        var calculo = findViewById<View>(R.id.rest_restar) as Button

        calculo.setOnClickListener(View.OnClickListener {
            var rest_res = num1.text.toString().toInt() - num2.text.toString().toInt()
            var rest_resultado: TextView = findViewById(R.id.rest_res) as TextView
                rest_resultado.text = rest_res.toString()
        })

        var rest_salir = findViewById<Button>(R.id.rest_salir)
            rest_salir.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
