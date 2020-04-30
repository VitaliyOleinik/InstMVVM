package com.example.socialmediakotlin.view

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.socialmediakotlin.R

class NewsDetailActivity: AppCompatActivity() {

    private lateinit var tvNewsDetail: TextView
    private lateinit var tvImageDetail: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)

        tvNewsDetail = findViewById(R.id.tvNewsDetail)
        tvImageDetail = findViewById(R.id.imageView6)

        val news: News = intent.getParcelableExtra("news")
        tvNewsDetail.text = news.getTheme()
        tvImageDetail.setImageResource(news.getImageUrl())
    }
}