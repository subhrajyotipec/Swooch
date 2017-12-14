package com.subhra.swooch

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.subhra.swooch.Model.Player
import kotlinx.android.synthetic.main.activity__legue.*
import kotlinx.android.synthetic.main.activity_welcome.*

class Activity_Legue : ActivityLifecycle() {

    var player= Player(league = "", skill = "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__legue)
    }
    fun onmenclicked(view: View){
        womanLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        player.league= "men"
    }
    fun onwomanclicked(view: View){
        menLeaguebtn.isChecked=false
        coedLeagueBtn.isChecked=false
        player.league="woman"

    }
    fun oncoedclicked(view: View){
        menLeaguebtn.isChecked=false
        womanLeagueBtn.isChecked=false
        player.league="coed"

    }



    fun openSkillActivity(view: View) {
        if (player.league != ""){



        val skillActivity = Intent(this, Activity_Skill::class.java)
        skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)

    }else {
            Toast.makeText(this, "Please select a Legue...", Toast.LENGTH_SHORT).show()
        }



    }

}
