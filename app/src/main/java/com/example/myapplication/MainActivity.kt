package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btn = findViewById<com.google.android.material.button.MaterialButton>(R.id.btn)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_place, BlankFragment.newInstance())
            .commit()


    }

    fun click(view: View) {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_place, BlankFragment2.newInstance())
            .commit()
    }

    fun click1(view: View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_place, BlankFragment.newInstance())
            .commit()

    }

    fun click3(view: View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_place, BlankFragment3.newInstance())
            .commit()

    }

    fun click4(view: View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_place, BlankFragment2.newInstance())
            .commit()

    }
}
