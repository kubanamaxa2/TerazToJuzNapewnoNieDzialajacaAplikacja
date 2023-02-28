package com.example.teraztojuznapewnoniedzialajacaaplikacja

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

        findViewById<TextView>(R.id.txtvw1).setOnClickListener{
            Toast.makeText(applicationContext, "Login = Imię | Hasło = Nazwisko", Toast.LENGTH_LONG).show()
        }
     findViewById<Button>(R.id.btn1).setOnClickListener{

         val intent = Intent(this, DaneUz::class.java)
         startActivity(intent)
     }
    }
}