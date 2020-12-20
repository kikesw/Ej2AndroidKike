package com.example.ejerciciorecukike1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Boton1 = findViewById<Button>(R.id.primero)
        val Boton2 = findViewById<Button>(R.id.segundo)
        val siguiente = findViewById<Button>(R.id.tercero)
        val textview = findViewById<TextView>(R.id.texto)

        Boton1.setOnClickListener(){
            textview?.let{
                val texto = it.text
                val nuevo = "Click hecho!"
                it.text = "$texto $nuevo"
            }
            siguiente.isEnabled = textview.text.isNotEmpty()
        }

        Boton2.setOnClickListener(){
            textview?.let {
                val guardado = it.text
                it.text = "$guardado ${ Random.nextInt(0,10)}"
            }

        }

        siguiente.setOnClickListener {
            val text = textview.text
            val intent = Intent(this, Second::class.java)
            intent.putExtra(Second.cont1, text.toString())
            startActivity(intent)
        }


        Toast.makeText(this,"Ejercicio de kike", Toast.LENGTH_LONG).show()
    }
}


