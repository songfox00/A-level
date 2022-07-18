package com.example.a_level.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.view.View
import com.example.a_level.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var content=SpannableString(binding.login.text.toString())
        content.setSpan(UnderlineSpan(), 0, content.length, 0)
        binding.login.text=content

        binding.login.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            }

        binding.emailSignUP.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}