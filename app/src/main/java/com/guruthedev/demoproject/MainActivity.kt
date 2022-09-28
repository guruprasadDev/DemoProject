package com.guruthedev.demoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

private var TAG1 = "MyActivity1"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG1, "onCreate()")

        val btnStartAnotherActivity = findViewById<Button>(R.id.btnStartAnotherActivity)

        val navigationBtn = findViewById<Button>(R.id.navigationBtn)

        navigationBtn.setOnClickListener {
            startActivity(Intent(this, BottomNavigationBar::class.java))
        }
        btnStartAnotherActivity.setOnClickListener {
            callActivity()
        }
    }

    private fun callActivity() {
        val edtName = findViewById<EditText>(R.id.editTextTextPersonName)
        val edtEmail = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val edtPhone = findViewById<EditText>(R.id.editTextPhone)
        val edtPassword = findViewById<EditText>(R.id.editTextTextPassword)

        val name = edtName.text.toString()
        val email = edtEmail.text.toString()
        val phone = edtPhone.text.toString()
        val password = edtPassword.text.toString()

        Intent(this, MainActivity2::class.java).also { intent ->
            intent.putExtra("EXTRA_NAME", name)
            intent.putExtra("EXTRA_EMAIL", email)
            intent.putExtra("EXTRA_PHONE", phone)
            intent.putExtra("EXTRA_PASSWORD", password)

            // start your next activity
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG1, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG1, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG1, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG1, "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG1, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG1, "onDestory()")
    }
}