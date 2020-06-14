package com.example.udemyprojectsection5swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.udemyprojectsection5swoosh.Model.User
import com.example.udemyprojectsection5swoosh.R
import com.example.udemyprojectsection5swoosh.Utilities.EXTRA_USER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var user: User
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_USER, user)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        user = intent.getParcelableExtra(EXTRA_USER)
        finishBtn.setOnClickListener {
            if (user.skill != ""){
                var finalAct = Intent(this, FinalActivity::class.java)
                finalAct.putExtra(EXTRA_USER, user)
                startActivity(finalAct)
            }
            else{
                val popup = Toast.makeText(this, "Please select your skill to continue.", Toast.LENGTH_LONG)
                popup.show()
            }
        }
        beginnerToggleButton.setOnClickListener {
            ballerToggleButton.isChecked = false
            user.skill = "Beginner"
        }
        ballerToggleButton.setOnClickListener {
            beginnerToggleButton.isChecked = false
            user.skill = "Baller"
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            user = savedInstanceState.getParcelable<User>(EXTRA_USER)!!
        }
    }
}