package com.neppplus.intent_20210819

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherBtn.setOnClickListener {

//            버튼이 눌리면 => OtherActivity로 이동.

//            출발지 : MainActivity (여기) -> 도착지 : OtherActivity

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

    }
}