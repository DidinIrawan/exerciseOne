package com.example.exerciseone

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.exerciseone.databinding.ActivityBoardBinding
import kotlinx.android.synthetic.main.activity_board.*
import kotlinx.android.synthetic.main.activity_main.*

class BoardActivity : AppCompatActivity() {
    var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_board)
        val binding: ActivityBoardBinding = DataBindingUtil.setContentView(this, R.layout.activity_board)

        val player1Name = intent.getStringExtra(FIRST_PLAYER_NAME)
        val player2Name = intent.getStringExtra(SECOND_PLAYER_NAME)

//        playersBanner.text= "$player1Name VS $player2Name"
        binding.player1Name = player1Name
        binding.player2Name=player2Name
    }

    fun onBackMain(view: View) {
        onBackPressed()
    }
    fun flip(view: View){
        this.counter += 1
        println("Counter $counter")
    }

}