package com.rootcode.register_form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondaryActivity : AppCompatActivity() {
    private lateinit var name:TextView
    private lateinit var email:TextView
    private lateinit var pass:TextView
//    private lateinit var gender:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        name = findViewById(R.id.fullname)
        pass = findViewById(R.id.pasw)
        email = findViewById(R.id.Email)
//        gender = findViewById(R.id.gender)
        val Name = intent.getStringExtra("fln",)
        val name1 = intent.getStringExtra("fln1")
        val Email = intent.getStringExtra("email")
        val Pass12 = intent.getStringExtra("pass")
//        val Gender1 = intent.getStringExtra("gend")

        name.setText("Name : "+Name +name1)
        email.setText("EMAIL :"+Email)
        pass.setText("PASSWORD :"+Pass12)
////        gender.setText("GENDER :"+Gender1)

    }
}