package com.example.kevinm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var info = "Kevin IDGS"
        var texto1: TextView = findViewById(R.id.titulo) as TextView
        texto1.text = info.toString()

        var texto2: TextView = findViewById(R.id.texto) as TextView

        var i = 1
        var salida = "los datos son:"
        while (i < 6) {
            if (i == 1) {
                salida = salida + 10
            } else {
                salida = salida + 1
            }
            i++
        }
        texto2.text = salida.toString()
        Toast.makeText(this, "El resultado es:" + salida, Toast.LENGTH_LONG).show()

        //------------------------------------------------------------------------------------------

        var opr_suma = findViewById<Button>(R.id.opr_suma)
        opr_suma.setOnClickListener {
            val intent = Intent(this, suma::class.java)
            startActivity(intent)
        }

        var opr_resta = findViewById<Button>(R.id.opr_resta)
            opr_resta.setOnClickListener {
            val intent = Intent(this, Resta::class.java)
            startActivity(intent)
        }

        var opr_multiplicacion = findViewById<Button>(R.id.opr_multiplicacion)
            opr_multiplicacion.setOnClickListener {
            val intent = Intent(this, Multiplicacion::class.java)
            startActivity(intent)
        }

        var opr_division = findViewById<Button>(R.id.opr_division)
            opr_division.setOnClickListener {
            val intent = Intent(this, Division::class.java)
            startActivity(intent)
        }

        var arreglos = findViewById<Button>(R.id.arreglos)
            arreglos.setOnClickListener {
            val intent = Intent(this, Arreglos::class.java)
            startActivity(intent)
        }

    }
}