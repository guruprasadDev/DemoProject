package com.guruthedev.demoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

private var TAG1= "MyActivity1"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG1,"onCreate()")

        var btnStartAnotherActivity = findViewById<Button>(R.id.btnStartAnotherActivity)

        var navigationBtn = findViewById<Button>(   R.id.navigationBtn)

        navigationBtn.setOnClickListener {

            val intent = Intent(this, NavigationFragment::class.java)
            startActivity(intent)
        }

        btnStartAnotherActivity.setOnClickListener {
           callActivity()
        }
    }

    private fun callActivity() {
        val name = findViewById<EditText>(R.id.editTextTextPersonName)
        val email = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val phone = findViewById<EditText>(R.id.editTextPhone)
        val password = findViewById<EditText>(R.id.editTextTextPassword)

        val message = name.text.toString()
        val message1 = email.text.toString()
        val message2 = phone.text.toString()
        val message3 = password.text.toString()

        val intent = Intent(this, MainActivity2::class.java).also {

            it.putExtra("EXTRA_MESSAGE1",message)
            it.putExtra("EXTRA_MESSAGE2",message1)
            it.putExtra("EXTRA_MESSAGE3",message2)
            it.putExtra("EXTRA_MESSAGE4",message3)

            // start your next activity
            startActivity(it)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG1,"onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG1,"onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG1,"onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG1,"onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG1,"onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG1,"onDestory()")
    }
}