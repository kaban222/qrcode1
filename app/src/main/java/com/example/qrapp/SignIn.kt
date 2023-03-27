package com.example.qrapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.qrapp.databinding.ActivityRegistrationBinding
import com.example.qrapp.databinding.ActivitySignInBinding

class SignIn : AppCompatActivity() {
    lateinit var bindingClass: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.GoToLogIn.setOnClickListener{
            val intent = Intent(this, registration::class.java)
            startActivity(intent)
        }
    }
}