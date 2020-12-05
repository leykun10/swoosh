package com.example.swoosh

import Model.Player
import Utilities.ExtraPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
       val player:Player=intent.getParcelableExtra<Player>(ExtraPlayer)!!
        searchLeagueText.text = "looking for  ${player.league}  ${player.skill} league near you"
    }
}