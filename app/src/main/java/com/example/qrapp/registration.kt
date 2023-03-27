package com.example.qrapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.qrapp.databinding.ActivityRegistrationBinding

class registration : AppCompatActivity() {
    lateinit var bindingClass: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.goToSignIn.setOnClickListener{
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }
    }

}