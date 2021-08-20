package com.neppplus.intent_20210819

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_NICKNAME = 1000
    val REQ_FOR_PHONE = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callBtn.setOnClickListener {

            val phoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:${phoneNum}")
            val myIntent = Intent( Intent.ACTION_CALL, myUri )
            startActivity(myIntent)

        }

        dialBtn.setOnClickListener {

//            입력한 전화번호를 변수로 저장.
            val inputPhoneNum = phoneNumEdt.text.toString()

//            그 번호로 전화 연결

//            1. 어디로 전화 걸지 정보 (Uri) 완성
            val myUri = Uri.parse("tel:${inputPhoneNum}")
//            2. 완성된 정보로 전화 거는 Intent
            val myIntent = Intent( Intent.ACTION_DIAL, myUri )
//            3. 실제로 Intent 실행
            startActivity(myIntent)

        }

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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_FOR_NICKNAME) {

            if ( resultCode == Activity.RESULT_OK ) {

//                닉네임을 가지러 가서 => 확인까지 한 상황.
//                첨부된 닉네임이 있을것이다.

                val newNick = data?.getStringExtra("nick")

                nicknameTxt.text = newNick

            }

        }

    }

}