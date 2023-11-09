package com.example.android_60

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class NewActivity : AppCompatActivity() {

    private lateinit var fechar: Button
    private lateinit var gasolina2: TextView
    private lateinit var alcool2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        gasolina2 = findViewById(R.id.textView3)
        alcool2 = findViewById(R.id.textView2)
        val intent = intent
        if(intent.hasExtra("gasolina") && intent.hasExtra("alcool")){
            val gasolina = intent.getStringExtra("gasolina")
            val alcool = intent.getStringExtra("alcool")
            if(gasolina != null && alcool != null){
                gasolina2.text = gasolina
                alcool2.text = alcool
            }
        }
        fechar = findViewById(R.id.close)
        fechar.setOnClickListener(){
            finish()
        }
    }
}