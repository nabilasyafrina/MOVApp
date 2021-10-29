package com.codeurfuture.mov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codeurfuture.mov.onboarding.OnboardingOneActivity
import java.util.logging.Handler

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var handler = android.os.Handler()
        handler.postDelayed({
            var intent =Intent(this@SplashScreenActivity, OnboardingOneActivity::class.java)
            startActivity(intent)

        }, 5000)

    }
}
