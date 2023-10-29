package com.example.mail

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var listView: ListView? = null
    private val emails = arrayOf("Email 1", "Email 2", "Email 3", "Email 4", "Email 5")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)
        listView = findViewById<ListView>(R.id.list)

        // Tạo một ArrayAdapter để kết nối dữ liệu với ListView
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, emails)

        // Đặt Adapter cho ListView
        listView.setAdapter(adapter)
    }
}