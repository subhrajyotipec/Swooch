package com.subhra.swooch

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity__legue.*
import kotlinx.android.synthetic.main.activity_welcome.*

class Activity_Legue : ActivityLifecycle() {
    var selectedLegue =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__legue)
    }
    fun onmenclicked(view: View){
        womanLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        selectedLegue= "men"
    }
    fun onwomanclicked(view: View){
        menLeaguebtn.isChecked=false
        coedLeagueBtn.isChecked=false
        selectedLegue="woman"

    }
    fun oncoedclicked(view: View){
        menLeaguebtn.isChecked=false
        womanLeagueBtn.isChecked=false
        selectedLegue="coed"

    }



    fun openSkillActivity(view: View) {
        if (selectedLegue != ""){



        val skillActivity = Intent(this, Activity_Skill::class.java)
        startActivity(skillActivity)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLegue)
    }else {
            Toast.makeText(this, "Please select a Legue...", Toast.LENGTH_SHORT).show()
        }



    }

}
