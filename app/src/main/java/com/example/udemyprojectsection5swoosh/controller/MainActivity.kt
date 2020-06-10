package com.example.udemyprojectsection5swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.udemyprojectsection5swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nxtBtn.setOnClickListener {
            val league = Intent(this, LeagueActivity::class.java)
            startActivity(league)
        }
    }
}