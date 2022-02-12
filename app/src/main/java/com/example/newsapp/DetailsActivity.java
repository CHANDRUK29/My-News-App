package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.newsapp.Model.NewsHeadlines;

public class DetailsActivity extends AppCompatActivity {

    private static final String TAG = "DetailsActivity";
    NewsHeadlines headlines;
    TextView title,author,time,detail,content;
    ImageView imgnews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        title = findViewById(R.id.text_detail_title);
        author = findViewById(R.id.text_detail_author);
        time = findViewById(R.id.text_detail_time);
        detail = findViewById(R.id.text_detail_detail);
        content = findViewById(R.id.text_detail_content);
        imgnews = findViewById(R.id.img_detail_news);

        headlines = (NewsHeadlines) getIntent().getSerializableExtra("data");

        title.setText(headlines.getTitle());
        author.setText(headlines.getAuthor());
        time.setText(headlines.getPublishedAt());
        detail.setText(headlines.getDescription());
        content.setText(headlines.getContent());
        Glide.with(getApplicationContext()).load(headlines.getUrlToImage()).into(imgnews);


    }
}