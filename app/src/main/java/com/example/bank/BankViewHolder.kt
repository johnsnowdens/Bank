package com.example.bank

import android.graphics.Color
import android.view.TextureView
import android.view.View
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class BankViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    val streetNameTV:TextView = itemView.findViewById(R.id.streetTV)
    val nameTV:TextView = itemView.findViewById(R.id.nameTV)
    val isWorkTV:TextView = itemView.findViewById(R.id.isWorkTV)
    val  workTimeTV:TextView = itemView.findViewById(R.id.WorkStartEndTV)

    fun bind(bank:Bank){
        streetNameTV.text= bank.streetName
        nameTV.text = bank.name
        workTimeTV.text = bank.workTime

        if (bank.isWork==true){
            isWorkTV.text = "Работает"
            isWorkTV.setTextColor(Color.GREEN)
        }else{
            isWorkTV.text= "закрыто"
            isWorkTV.setTextColor(Color.RED)
        }
    }

}
