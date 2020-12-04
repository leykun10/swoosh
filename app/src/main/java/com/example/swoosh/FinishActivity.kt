package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
       val league = intent.getStringExtra(ExtraLeague)
        val skill =intent.getStringExtra(ExtraSkill)
        searchLeagueText.text = "looking for  $league  $skill league near you"
    }
}