package com.example.calculadoradeimcmat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadoradeimcmat.databinding.ActivityCalculoResultadoBinding

class CalculoResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCalculoResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}