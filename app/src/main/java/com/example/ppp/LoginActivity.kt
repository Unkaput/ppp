package com.example.ppp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first) // Убедитесь, что ваш макет называется first.xml

        val loginButton: Button = findViewById(R.id.button)
        val nameEditText: EditText = findViewById(R.id.editTextText)
        val passwordEditText: EditText = findViewById(R.id.editTextText2)
        val registrButton: Button = findViewById(R.id.textView3)

        loginButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (name.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter both name and password", Toast.LENGTH_SHORT).show()
            } else {
                // Здесь вы можете добавить логику для обработки входа
                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
            }
        }
        registrButton.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}
