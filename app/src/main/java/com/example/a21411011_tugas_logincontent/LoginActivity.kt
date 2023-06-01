package com.example.a21411011_tugas_logincontent


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a21411011_tugas_logincontent.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener{
            val intent = Intent(this, ContentActivity::class.java)
            startActivity(intent)
        }

        binding.resetPassword.setOnClickListener {
            Intent(this, ResetPasswordActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}



