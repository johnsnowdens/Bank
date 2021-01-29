package com.example.bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        banksBtn.setOnClickListener {
            val intent = Intent(this, BankActivity::class.java)
            startActivity(intent)

        }
        moneyBtn.setOnClickListener {
            val intent = Intent(this, MoneysActivity::class.java)
            startActivity(intent)
        }

        signInBtn.setOnClickListener {
            val intent = Intent(this,AppActivity::class.java)
            startActivity(intent)
//            AlertDialog.Builder(this)
//                .setTitle("авторизация")
//                .setMessage("введите ваше имя")
//                .setView(R.layout.auth)
//                .setPositiveButton("войти"){_ ,_->}
//                .setNegativeButton("отмена"){_ ,_->}
//                .create()
//                .show()
        }

    }
}