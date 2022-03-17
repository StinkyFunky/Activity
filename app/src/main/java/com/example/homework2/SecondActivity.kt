package com.example.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity(){
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            val address: String = binding.editAddress.text.toString()
            intent.putExtra("address", address)

            val name: String = binding.Name.text.toString()
            val surname: String = binding.Surname.text.toString()
            val age: String = binding.Age.text.toString()
            intent.putExtra("name", name)
            intent.putExtra("surname", surname)
            intent.putExtra("age", age)

            startActivity(intent)
        }

        val data = intent.extras
        val valueName = data?.getString("name")
        val valueSurname = data?.getString("surname")
        val valueAge = data?.getString("age")

        binding.apply {

            Name.text = "Name: $valueName"
            Surname.text = "Surname: $valueSurname"
            Age.text = "Age: $valueAge"
        }
    }
}