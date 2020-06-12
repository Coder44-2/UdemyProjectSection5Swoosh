package com.example.udemyprojectsection5swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.udemyprojectsection5swoosh.Model.User
import com.example.udemyprojectsection5swoosh.R
import com.example.udemyprojectsection5swoosh.Utilities.EXTRA_USER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var user = User("", "")
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_USER, user)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        NxtBtn.setOnClickListener {
            if(user.league != ""){
                val skill = Intent(this, SkillActivity::class.java)
                skill.putExtra(EXTRA_USER, user)
                startActivity(skill)
            }
            else{
                val popup = Toast.makeText(this, "Please select a league to continue.", Toast.LENGTH_LONG)
                popup.show()
            }
        }
        MentoggleButton.setOnClickListener {
            WomentoggleButton2.isChecked = false
            Co_EdtoggleButton3.isChecked = false
            user.league = "Men"
        }
        WomentoggleButton2.setOnClickListener {
            MentoggleButton.isChecked = false
            Co_EdtoggleButton3.isChecked = false
            user.league = "Women"
        }
        Co_EdtoggleButton3.setOnClickListener {
            MentoggleButton.isChecked = false
            WomentoggleButton2.isChecked = false
            user.league = "Co-ed"
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            user = savedInstanceState.getParcelable<User>(EXTRA_USER)!!
        }
    }
}