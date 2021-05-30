package com.example.dictionnaireapp_iva


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


        val cat = findViewById<TextView>(R.id.textView)
        val dog = findViewById<TextView>(R.id.textView2)
        val horse = findViewById<TextView>(R.id.textView3)
        val raven = findViewById<TextView>(R.id.textView4)


        cat.setOnClickListener{
            Toast.makeText(this, "Cat definition", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("index",1)
            startActivity(intent)
        }

        dog.setOnClickListener{
            Toast.makeText(this, "Cat definition", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("index",2)
            startActivity(intent)
        }
        horse.setOnClickListener{
            Toast.makeText(this, "Cat definition", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("index",3)
            startActivity(intent)
        }
        raven.setOnClickListener{
            Toast.makeText(this, "Cat definition", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("index",4)
            startActivity(intent)
        }

    }
}