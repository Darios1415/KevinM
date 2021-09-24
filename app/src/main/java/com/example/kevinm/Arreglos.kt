package com.example.kevinm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Arreglos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arreglos)

        var dias = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
        var numeros = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

        var texto = "Hola IDGS-101"
        var info1: TextView = findViewById(R.id.array_a) as TextView
        var info2: TextView = findViewById(R.id.array_b) as TextView
            info1.text = texto.toString()

        for (i in 0 until dias.size){
            info1.append(dias[i].toString())
        }

        info2.text = "numero es: ${numeros[1]}"

        info1.append(dias.get(0)+"\n")
        info1.append(dias.get(1)+"\n")
        info1.append(dias.get(2)+"\n")
        info1.append(dias.get(5)+"\n")

        //-----------------------------------------------------------------
        numeros.add(999)
        numeros.remove(1)
        numeros.removeAt(5)

        for (y in 0 until numeros.size){
            info2.append(numeros[y].toString()+"\n")
        }

        var array_salir = findViewById<Button>(R.id.array_salir)
            array_salir.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
    }
}