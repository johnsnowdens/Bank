package com.example.bank

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BanksAdapter (val banks:MutableList<Bank>):RecyclerView.Adapter<BankViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BankViewHolder {
       val inflater = LayoutInflater.from(parent.context)
        val itemView:View = inflater.inflate(R.layout.bansk_list_item,parent,false)
        return BankViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return banks.size
    }
    override fun onBindViewHolder(holder: BankViewHolder, position: Int) {

       val bank = banks[position]
        holder.bind(bank)
    }


}