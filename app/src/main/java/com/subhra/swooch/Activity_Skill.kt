package com.subhra.swooch

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Activity_Skill : ActivityLifecycle() {
    var Legue = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skill_activity)
       Legue= intent.getStringExtra(EXTRA_LEAGUE)
    }


}
