package com.example.gmaillistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import com.example.w6_kotlin_listview.CustomAdapter
import com.example.w6_kotlin_listview.ItemData

class MainActivity : AppCompatActivity() {
    lateinit var customAdapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inbox = findViewById<TextView>(R.id.inbox)
        inbox.text = "Inbox"
        //Khai bao danh sach item list
        var list = mutableListOf<ItemData>()
        list.add(
            ItemData(
                "E", "Edurila.com", "$19 Only (First 10 spots) - Btselling... Are you looking" +
                        "to Learn Web", "12:34 PM"
            )
        )
        list.add(
            ItemData(
                "C",
                "Chris Abad",
                "Help make Campaign Monintor better Let us know your thought",
                "11:22 PM"
            )
        )
        list.add(ItemData("T", "Tuto.com", "Finding for good taxi?", "11:99 PM"))
        list.add(
            ItemData(
                "S",
                "Hola Base",
                "click to the link below to see all advantages of our service",
                "12:34 PM"
            )
        )
        list.add(
            ItemData(
                "S",
                "Support",
                "click to the link below to see all advantages of our service",
                "12:34 PM"
            )
        )
        list.add(
            ItemData(
                "M",
                "Matt",
                "Matt from lonic Creator is Here! Announcing the all-new Creator\"",
                "1:20 PM"
            )
        )

        customAdapter = CustomAdapter(this, list)

        //khai bao bien den listEmail
        val listEmail = findViewById<ListView>(R.id.listEmail)
        listEmail.adapter = customAdapter
    }
}