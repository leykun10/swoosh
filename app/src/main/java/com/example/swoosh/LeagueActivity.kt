package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

     var selectedLeague:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


    }
    fun leagueNextClicked(view:View){
        if(selectedLeague!=null){
            val skillActivity  = Intent(this,SkillActivity::class.java)
            skillActivity.putExtra(
                ExtraLeague,selectedLeague
            )
            startActivity(skillActivity)
        }
        else{
        Toast.makeText(applicationContext,"select a league",Toast.LENGTH_SHORT).show()

        }

    }

    fun womenButtonClicked(view:View){
            selectedLeague="womenLeague"
            menButton.isChecked=false
            coedButton.isChecked=false
    }
    fun menButtonClicked(view:View){
        selectedLeague="menLeague"
        womenButton.isChecked=false
        coedButton.isChecked=false

    }
    fun coedButtonClicked(view:View){
        selectedLeague="coedLeague"
        menButton.isChecked=false
        womenButton.isChecked=false

    }

}