package com.example.kinogo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textview = findViewById<TextView>(R.id.textview)
        val textviewcopy = findViewById<TextView>(R.id.textviewcopy)
        val buttoncopy : Button = findViewById(R.id.buttoncopy)

        val Moscow = City("Moscow", 0)
        Moscow.temperature = 0
        textview.text = "Saint Petersburg (-5)"

        button.setOnClickListener{
            textview.text = Moscow.town + " (" + Moscow.temperature + ")"
        }

        buttoncopy.setOnClickListener{
            val objectView = object {
                val MSKcopy = Moscow.copy()
            }
            textviewcopy.text = objectView.MSKcopy.town + " (" + Moscow.temperature + ")"
        }

    }
}