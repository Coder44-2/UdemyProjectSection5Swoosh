package com.example.udemyprojectsection5swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.udemyprojectsection5swoosh.Model.User
import com.example.udemyprojectsection5swoosh.R
import com.example.udemyprojectsection5swoosh.Utilities.EXTRA_USER
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : BaseActivity() {
    lateinit var user: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        user = intent.getParcelableExtra(EXTRA_USER)
        searchingTxtFld.text = "Looking for a ${user.league?.toLowerCase()} ${user.skill?.toLowerCase()} league near you..."
    }
}