package com.neppplus.loginuipractice_20220703

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUpBtn.setOnClickListener {
            Toast.makeText(this, "회원가입버튼 클릭", Toast.LENGTH_SHORT).show()
        }

//        로그인 로직 실행
        loginBtn.setOnClickListener {
//            아이디 값과 비밀번호 값을 변수화
            val id = idEdt.text.toString() // 아이디값 변수화
            val password = passwordEdt.text.toString() //비밀번호 값 변수화


        }
    }
}