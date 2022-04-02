package com.example.intentsextra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentsextra.databinding.ActivityMain2Binding
import com.example.intentsextra.databinding.ActivityMainBinding

const val EXTRA_NAME = "com.example.intentsextra.NAME"

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.buttonBack.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.apply {
                putExtra(EXTRA_NAME, binding.editWelcome.text.toString())
            }
            startActivity(intent)
            finish()
        }

    }
}