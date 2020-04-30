package com.example.socialmediakotlin.model

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.socialmediakotlin.view.News
import com.example.socialmediakotlin.R
import com.example.socialmediakotlin.view.NewsDetailActivity
import com.example.socialmediakotlin.view.NewsListAdapter
import java.util.*


class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var adapter: NewsListAdapter? = null
    private var listener: NewsListAdapter.ItemClickListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listener = object : NewsListAdapter.ItemClickListener {
            override fun itemClick(position: Int, item: News?) {
                val intent = Intent(this@MainActivity, NewsDetailActivity::class.java)
                intent.putExtra("news", item)
                startActivity(intent)
            }
        }

        recyclerView = findViewById(R.id.recyclerView)
        this.recyclerView?.layoutManager = LinearLayoutManager(this)

        adapter = NewsListAdapter(
            newsGenerator()!!,
            listener as NewsListAdapter.ItemClickListener
        )
        this.recyclerView?.adapter = adapter
    }





}
