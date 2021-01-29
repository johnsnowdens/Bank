package com.example.bank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_moneys.*

class MoneysActivity : AppCompatActivity() {
    val moneys = mutableListOf(
        Money (
            "USD",
            "Американский доларar",
            77.44,
            70.00,
            R.drawable.dm
        ),
        Money (
            "USD",
            "Американский доларar",
            77.44,
            70.00,
            R.drawable.dm
        ),
        Money (
            "USD",
            "Американский доллор",
            77.44,
            70.00,
            R.drawable.dm
        )
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moneys)

        moneysRV.layoutManager = LinearLayoutManager(this)
        moneysRV.adapter = MoneyAdapter(moneys)
    }
}