package com.example.a21411011_tugas_logincontent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val Movie = intent.getParcelableExtra<Movie>("Movie")
        if (Movie != null) {
            val imageView: ImageView = findViewById(R.id._imageDetail)
            val textViewTitle: TextView = findViewById(R.id.imageTitle)
            val textViewDesc: TextView = findViewById(R.id.imageDesc)

            imageView.setImageResource(Movie.imageSource)
            textViewTitle.text = Movie.ImageTitle
            textViewDesc.text = Movie.imageDecs
        }
    }
}