package com.example.udemyprojectsection5swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.udemyprojectsection5swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        NxtBtn.setOnClickListener {
            val skill = Intent(this, SkillActivity::class.java)
            startActivity(skill)
        }
    }
}