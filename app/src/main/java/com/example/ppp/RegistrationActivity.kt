package com.example.ppp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second) // Убедитесь, что ваш макет называется second.xml

        val backButton: Button = findViewById(R.id.textView2)
        val nextButton: Button = findViewById(R.id.button) // Добавьте кнопку "Next" в макет

        backButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        nextButton.setOnClickListener {
            val intent = Intent(this, Third::class.java)
            startActivity(intent)
        }
    }
}
