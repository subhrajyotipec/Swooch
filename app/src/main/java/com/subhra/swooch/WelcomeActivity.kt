package com.subhra.swooch

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : ActivityLifecycle() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)





        getStartedBtn.setOnClickListener {
            val legueIntent = Intent(this, Activity_Legue::class.java)
            startActivity(legueIntent)
        }
    }
}
