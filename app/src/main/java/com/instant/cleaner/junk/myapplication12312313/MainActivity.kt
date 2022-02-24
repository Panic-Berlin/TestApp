package com.instant.cleaner.junk.myapplication12312313

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn)
        val login = findViewById<EditText>(R.id.et_login)
        val password = findViewById<EditText>(R.id.tv_password)
        btn.setOnClickListener {
            if (login.text!!.isNotEmpty()&& password.text!!.isNotEmpty()){
                val intent = Intent(applicationContext, MainActivity2::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Не правильный логин или пароль", Toast.LENGTH_SHORT).show()
            }
        }
}
}
