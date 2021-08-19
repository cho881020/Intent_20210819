package com.neppplus.intent_20210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_view_message.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

//        화면에 들어오자마자 => 첨부된 데이터 있는지 확인 => 변수에 저장.
        val receivedMessage = intent.getStringExtra( "message" )

//        UI에 반영.
        messageTxt.text = receivedMessage

    }
}