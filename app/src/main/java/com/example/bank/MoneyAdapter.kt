package com.example.bank

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MoneyAdapter (
    val moneys:MutableList<Money>):RecyclerView.Adapter<MoneyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoneyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.moneys_list_item,parent,false)
        return MoneyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MoneyViewHolder, position: Int) {
        val money = moneys[position]
        holder.bind(money)
    }

    override fun getItemCount(): Int {
        return moneys.size
    }

}
