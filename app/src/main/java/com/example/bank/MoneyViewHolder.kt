package com.example.bank

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MoneyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    val moneyNameTV:TextView= itemView.findViewById(R.id.moneyNameTV)
    val moneyFullNameTV:TextView= itemView.findViewById(R.id.moneyFullNameTV)
    val buyTV:TextView= itemView.findViewById(R.id.buyTV)
    val cellTV:TextView= itemView.findViewById(R.id.cellTV)
    val moneyIconTV:ImageView= itemView.findViewById(R.id.moneyIconIV)

    fun bind(money:Money){
        moneyNameTV.text = money.moneyName
        moneyFullNameTV.text=money.moneyFullName
        buyTV.text=money.buyPrice.toString()
        cellTV.text = money.sellPrice.toString()
        moneyIconTV.setImageResource(money.moneyIconId)
    }

}