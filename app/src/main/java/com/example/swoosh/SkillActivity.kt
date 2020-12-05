package com.example.swoosh

import Model.Player
import Utilities.ExtraPlayer
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

  lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player= intent.getParcelableExtra<Player>(ExtraPlayer)!!
        if(savedInstanceState != null){
            player=savedInstanceState.getParcelable<Player>(ExtraPlayer)!!
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putParcelable(ExtraPlayer,player)
        super.onSaveInstanceState(outState)

    }

    fun  onSkillFinishClicked(view:View){
  if (player.skill!=null){
      var finishIntent= Intent(this,FinishActivity::class.java )
      finishIntent.putExtra(ExtraPlayer,player)
      startActivity(finishIntent)
  }
        else{
      Toast.makeText(this,"please select a skill",Toast.LENGTH_SHORT).show()
  }
    }
   fun  onBeginnerClicked(view: View){
  player.skill = "beginner"
       ballerButton.isChecked=false
   }
    fun onBalerClicked(view: View){
        player.skill="baler"
        begineerButton.isChecked=false
    }

}