package com.rootcode.register_form

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.UpdateLayout
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var register:Button
    private lateinit var fname:EditText
    private lateinit var lname:EditText
    private lateinit var Email:EditText
    private lateinit var Pass:EditText
    private lateinit var Image:ImageView
    private lateinit var upload:Button
    private lateinit var uri:Uri

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        register = findViewById(R.id.button)
        fname = findViewById(R.id.edifsn)
        lname = findViewById(R.id.edilsn)
        Email = findViewById(R.id.editText)
        Pass = findViewById(R.id.editText3)
        Image = findViewById(R.id.image1)
        upload = findViewById(R.id.uploadim)
//        Gender = findViewById(R.id.radioButton)
//        Gender = findViewById(R.id.radioButton2)



        upload.setOnClickListener {
            var intent1 = Intent(this@MainActivity,secondaryActivity::class.java)
            intent1.setAction(Intent.ACTION_GET_CONTENT)
            intent1.setType("Image/*")
            startActivityForResult(intent1,1)
        }

        register.setOnClickListener {
//            var Gender1:String = Gender.getText().toString()
            var Pass1:String = Pass.getText().toString()
            var EEmail:String = Email.getText().toString()
            var Lname:String = lname.getText().toString()
            var Fname:String = fname.getText().toString()


            var intent = Intent(this@MainActivity,secondaryActivity::class.java)

            intent.putExtra("fln",Fname,)
            intent.putExtra("fln1",Lname,)
            intent.putExtra("email",EEmail)
            intent.putExtra("pass",Pass1)
//            intent.putExtra("gend",Gender1)
            startActivity(intent)
        }
    }
}