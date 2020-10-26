package com.example.test_test

import android.content.Context
import android.provider.ContactsContract.CommonDataKinds.Note
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class TestAdapter(private var arrData: MutableList<String>?) :
    RecyclerView.Adapter<TestAdapter.NewViewHolder>() {





    class NewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTest: TextView = itemView.findViewById(R.id.tvTest)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestAdapter.NewViewHolder {
        return NewViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_sheet_bottom, parent, false))
    }

    override fun getItemCount(): Int {
        return arrData!!.size

    }

    override fun onBindViewHolder(holder: TestAdapter.NewViewHolder, position: Int) {
        holder.tvTest.text = arrData!![position]
    }

}