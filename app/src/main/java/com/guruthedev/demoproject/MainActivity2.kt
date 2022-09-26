package com.guruthedev.demoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private var TAG1= "MyActivity02"
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(TAG1, "onCreate()")


        val message = intent.getStringExtra("EXTRA_MESSAGE1")
        val message1 = intent.getStringExtra("EXTRA_MESSAGE2")
        val message2 = intent.getStringExtra("EXTRA_MESSAGE3")
        val message3 = intent.getStringExtra("EXTRA_MESSAGE4")

        val textView = findViewById<TextView>(R.id.name).apply {
            text = message
        }
        val textView1 = findViewById<TextView>(R.id.email).apply {
            text = message1
        }
        val textView2 = findViewById<TextView>(R.id.phone).apply {
            text = message2
        }
        val textView3 = findViewById<TextView>(R.id.password).apply {
            text = message3
        }
    }
                override fun onStart() {
                    super.onStart()
                    Log.d(TAG1, "onStart()")
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
