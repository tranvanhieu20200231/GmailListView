package com.example.w6_kotlin_listview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.TextView
import com.example.gmaillistview.R

class CustomAdapter(val activity: Activity, val list:List<ItemData>): ArrayAdapter<ItemData>(activity,R.layout.list_item) {
    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val contexts = activity.layoutInflater   //layoutInflater laf 1 component, chuyen layout xml thanh view trong layout
        val rowView = contexts.inflate(R.layout.list_item,parent, false)

        val sender = rowView.findViewById<TextView>(R.id.sender)
        val content = rowView.findViewById<TextView>(R.id.content)
        val time = rowView.findViewById<TextView>(R.id.time)
        val symbol = rowView.findViewById<TextView>(R.id.symbol)
        sender.text = list[position].sender
        content.text = list[position].content
        time.text = list[position].time
        symbol.text = list[position].symbol
        return rowView
    }
}