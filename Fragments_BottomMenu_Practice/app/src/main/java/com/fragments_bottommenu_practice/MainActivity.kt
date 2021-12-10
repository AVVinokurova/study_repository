package com.fragments_bottommenu_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val TAG = "MyTag"

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationMenu = findViewById(R.id.bottom_menu)
        bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.fragment_1 -> {
                    fragment = FirstFragment()
                    replaceFragment(fragment)
                }
                R.id.fragment_2 -> {
                    fragment = SecondFragment()
                    replaceFragment(fragment!!)
                }

            }
            true
        }
        bottomNavigationMenu.selectedItemId = R.id.fragment_1
    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()

    }
}