package com.subhra.swooch

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.subhra.swooch.Model.Player
import kotlinx.android.synthetic.main.skill_activity.*

class Activity_Skill : ActivityLifecycle() {
    lateinit var player : Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skill_activity)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        println(player)

    }

    fun onclicknewbie(view: View) {
        toggleBtnExpert.isChecked = false
        player.skill = "Newbie"
    }

    fun onclickexpert(view: View) {
        toggleBtnNewbie.isChecked = false
        player.skill = "Expert"
    }

    fun onclickdone(view: View) {
        if (player.skill != "") {
            val finishactivity = Intent(this, FinishActivity::class.java)
            finishactivity.putExtra(EXTRA_PLAYER,player)

            startActivity(finishactivity)
        } else {
            Toast.makeText(this, "please select the skill level...", Toast.LENGTH_SHORT).show()
        }
    }

}
