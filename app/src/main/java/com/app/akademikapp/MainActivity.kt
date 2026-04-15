package com.app.akademikapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.app.akademikapp.databinding.ActivityMainBinding
import com.app.akademikapp.ui.main.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var keepSplash = true

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)

        splashScreen.setKeepOnScreenCondition { keepSplash }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.root.postDelayed({
            keepSplash = false

            if (savedInstanceState == null) {
                supportFragmentManager.beginTransaction()
                    .replace(binding.container.id, HomeFragment())
                    .commit()
            }
        }, 1200)
    }
}