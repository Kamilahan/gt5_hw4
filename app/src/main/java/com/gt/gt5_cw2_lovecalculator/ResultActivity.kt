package com.gt.gt5_cw2_lovecalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity:AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
   setContentView(R.layout.activity_result)

    val result=intent.getStringExtra("result")
    val percentage=intent.getStringExtra("percentage")

    val tvResult = findViewById<TextView>(R.id.tv_result)
    val btnTryAgain=findViewById<Button>(R.id.btn_try_again)

    tvResult.text ="$percentage  $result"

    btnTryAgain.setOnClickListener(){
startActivity(Intent(this, MainActivity::class.java))
    }



}
}