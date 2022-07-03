package com.neppplus.loginuipractice_20220703

import android.content.Intent
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

//        회원가입 창으로 이동
        signUpBtn.setOnClickListener {
//            비행기 티켓을 발권(출발지 : this(MainActivity) -> 목적지(SignUpActivity)
            val myIntent = Intent(this, SignUpActivity::class.java)
//            실제 비행기를 출발
            startActivity(myIntent)
        }

//        로그인 로직 실행
        loginBtn.setOnClickListener {
            val inputEmail = idEdt.text.toString()

            val myIntent = Intent(this, MainActivity2::class.java)
            myIntent.putExtra("email", inputEmail)
            startActivity(myIntent)

////            아이디 값과 비밀번호 값을 변수화
//            val id = idEdt.text.toString() // 아이디값 변수화
//            val password = passwordEdt.text.toString() //비밀번호 값 변수화
//
//////            1. 아이디값이 "admin", 패스워드가 "asdf"
//////            2. 아이디 값 판별
////            if (id != "admin") {
////                Toast.makeText(this, "아이디가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
////            }
//////            3. 비밀번호 값 판별
////            else if (password != "asdf") {
////                Toast.makeText(this, "비밀번호가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
////            }
//////            4. 두가지 모두 맞을때
////            else {
////                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
////            }
//
////            조건문을 한번에 물어보는 경우
//            if (id == "admin" && password == "asdf") {
//                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
//            }
//            else {
//                Toast.makeText(this, "로그인에 실패하셨습니다.", Toast.LENGTH_SHORT).show()
//            }
        }
    }
}