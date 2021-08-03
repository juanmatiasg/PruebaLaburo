package com.example.laburoprueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.laburoprueba.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var binding :ActivityMainBinding
    var progressValue:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setearProgresbar()
    }

    private fun setearProgresbar() {
        binding.buttonIncrement.setOnClickListener {
            if(progressValue<100){
                progressValue += 10
                binding.progressBar.progress = progressValue
            }
        }

        binding.buttonDecrement.setOnClickListener {
            if(progressValue>0){
                progressValue -=10
                binding.progressBar.progress = progressValue
            }
        }
    }
}