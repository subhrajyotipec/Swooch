package com.subhra.swooch

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.subhra.swooch.Model.Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : ActivityLifecycle() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        println(player)

        textView.text = "looking for ${player.league} for compitition"

    }





}
