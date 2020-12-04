package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

   var league:String? = null
   var skill:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

    }
    fun  onSkillFinishClicked(view:View){
  if (skill!=null){
      var finishIntent= Intent(this,FinishActivity::class.java )
      league=intent.getStringExtra(ExtraLeague)
      finishIntent.putExtra(ExtraLeague,league)
      finishIntent.putExtra(ExtraSkill,skill)
      startActivity(finishIntent)
  }
        else{
      Toast.makeText(this,"please select a skill",Toast.LENGTH_SHORT).show()
  }
    }
   fun  onBeginnerClicked(view: View){
  skill = "beginner"
       ballerButton.isChecked=false
   }
    fun onBalerClicked(view: View){
        skill="baler"
        begineerButton.isChecked=false
    }

}