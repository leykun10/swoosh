package com.example.swoosh

import Model.Player
import Utilities.ExtraLeague
import Utilities.ExtraPlayer
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
     var player:Player? = Player(league = null,skill = null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState != null) {
            print(savedInstanceState.toString())
            player= savedInstanceState?.getParcelable(ExtraPlayer)
        }
        setContentView(R.layout.activity_league)

    }


    override fun onSaveInstanceState(outState: Bundle) {
        outState.putParcelable(ExtraPlayer,player)
        super.onSaveInstanceState(outState)
    }
    fun leagueNextClicked(view:View){
        if(player?.league!=null){
            val skillActivity  = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(
                ExtraPlayer,
                player
            )
            startActivity(skillActivity)
        }
        else{
        Toast.makeText(applicationContext,"select a league",Toast.LENGTH_SHORT).show()

        }

    }

    fun womenButtonClicked(view:View){
            player?.league="womenLeague"
            menButton.isChecked=false
            coedButton.isChecked=false
    }
    fun menButtonClicked(view:View){
       player?.league="menLeague"
        womenButton.isChecked=false
        coedButton.isChecked=false

    }
    fun coedButtonClicked(view:View){
      player?.league="coedLeague"
        menButton.isChecked=false
        womenButton.isChecked=false

    }

}