package com.neppplus.intent_20210819

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_NICKNAME = 1000
    val REQ_FOR_PHONE = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNicknameBtn.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)

        }

        sendMessageBtn.setOnClickListener {

//            전달 할 내용을 변수에 담자.
            val inputMessage = messageEdt.text.toString()

//            저장한 변수를 들고 메세지 화면으로 이동.
            val myIntent = Intent(this, ViewMessageActivity::class.java)
            myIntent.putExtra("message", inputMessage)
            startActivity(myIntent)

        }

        moveToOtherBtn.setOnClickListener {

//            버튼이 눌리면 => OtherActivity로 이동.

//            출발지 : MainActivity (여기) -> 도착지 : OtherActivity

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

    }
}