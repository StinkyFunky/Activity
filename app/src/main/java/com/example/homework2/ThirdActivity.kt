package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework2.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.extras
        val valueName = data?.getString("name")
        val valueSurname = data?.getString("surname")
        val valueAge = data?.getString("age")
        val valueAddress = data?.getString("address")

        binding.apply {

            Name.text = valueName ?: "ThirdActivity"
            Surname.text = valueSurname ?: "ThirdActivity"
            Age.text = valueAge ?: "ThirdActivity"
            Address.text = "Address: $valueAddress"
        }
    }
}