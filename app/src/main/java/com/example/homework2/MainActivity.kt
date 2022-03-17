package com.example.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            val name: String = binding.editName.text.toString()
            val surname: String = binding.editSurname.text.toString()
            val age: String = binding.editAge.text.toString()
            intent.putExtra("name", name)
            intent.putExtra("surname", surname)
            intent.putExtra("age", age)
            startActivity(intent)
        }
    }
}