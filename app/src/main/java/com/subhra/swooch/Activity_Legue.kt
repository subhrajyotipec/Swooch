package com.subhra.swooch

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity__legue.*
import kotlinx.android.synthetic.main.activity_welcome.*

class Activity_Legue : ActivityLifecycle() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__legue)
        proceed_btn.setOnClickListener {
            val proceedBtnIntent = Intent(this, Activity_Skill::class.java)
            startActivity(proceedBtnIntent)
        }
    }

}
