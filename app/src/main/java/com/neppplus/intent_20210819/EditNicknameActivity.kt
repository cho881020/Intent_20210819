package com.neppplus.intent_20210819

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickanme.*

class EditNicknameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickanme)

        okBtn.setOnClickListener {

//            입력한 닉네임 저장.
            val inputNickname = nicknameEdt.text.toString()

//            이전 화면으로 데이터를 들고 복귀.
            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNickname)

//            OK를 눌렀다고 명시 + 돌아갈 데이터 세팅
            setResult( Activity.RESULT_OK , resultIntent )

            finish()


        }

    }

}