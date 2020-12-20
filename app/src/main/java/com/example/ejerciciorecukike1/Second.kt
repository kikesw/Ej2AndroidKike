package com.example.ejerciciorecukike1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Second : AppCompatActivity(){

    companion object {
        const val cont1 = "Hola"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        val blancos = findViewById<Button>(R.id.blancos)
        val edit = findViewById<EditText>(R.id.edit)
        val vista = findViewById<TextView>(R.id.vista)

        edit.setOnClickListener(){
            blancos.isEnabled = edit.text.isNotEmpty()
        }

        blancos.setOnClickListener(){

            vista.text

        }

    }

}