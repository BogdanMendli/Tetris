package com.maschenko.tetris

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var circleImageView: CircleImageView

    private var imageUrl = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        circleImageView = profile_pic

        launchGame.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        if(v == launchGame){
            val intent = Intent(this, GameActivity::class.java)
            intent.putExtra("imageUrl", imageUrl)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
}


