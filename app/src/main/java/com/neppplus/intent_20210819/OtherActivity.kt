package com.neppplus.intent_20210819

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        returnToMainBtn.setOnClickListener {

//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)

//            이전화면 복귀 : 현재 화면을 종료.
            finish()

        }

    }
}