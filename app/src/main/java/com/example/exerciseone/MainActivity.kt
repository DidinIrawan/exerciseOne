package com.example.exerciseone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.example.exerciseone.view_model.PlayerViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    val activityName = "MAIN_ACTIVITY"
    val playerViewModel:PlayerViewModel by viewModels<PlayerViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("$activityName ON_CREATE")
        pencet_button.setOnClickListener(this)
        tekan_button.setOnClickListener(this)
        setResultText()
    }
    private fun setResultText(){
        name_text.text = "${playerViewModel.player1Name} VS ${playerViewModel.player2Name}"
    }

    override fun onClick(v: View?) {
        when(v){
            pencet_button -> showName()
            tekan_button -> toBoardActivity()
        }
    }

    fun toBoardActivity(){
        val intent = Intent(this, BoardActivity::class.java)
        intent.putExtra(FIRST_PLAYER_NAME, input_name.text.toString())
        intent.putExtra(SECOND_PLAYER_NAME, input_name2.text.toString())

        startActivity(intent)

    }

    fun showName() {
        playerViewModel.player1Name= input_name.text.toString()
        playerViewModel.player2Name = input_name2.text.toString()
        setResultText()
    }

    override fun onStart() {
        super.onStart()
        println("$activityName ON_START")

    }

    override fun onResume() {
        super.onResume()
        println("$activityName ON_RESUME")

    }

    override fun onPause() {
        super.onPause()
        println("$activityName ON_PAUSE")

    }

    override fun onStop() {
        super.onStop()
            println("$activityName ON_STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("$activityName ON_DESTROY")
    }

    //    fun handlePencet(view: View) {
//        val name = input_name.text.toString()
//        name_text.text = name
//    }
}