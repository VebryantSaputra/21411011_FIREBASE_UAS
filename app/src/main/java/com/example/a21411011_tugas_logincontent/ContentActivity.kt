package com.example.a21411011_tugas_logincontent


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContentActivity : AppCompatActivity() {

    private lateinit var MovieRecyclerView: RecyclerView
    private lateinit var MovieList : ArrayList<Movie>
    private lateinit var MovieAdapter : MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        MovieList = ArrayList()

        MovieList.add(
            Movie(R.drawable.cover1, "THE MANDALORIAN",
                "petualangan mandalorian.")
        )

        MovieList.add(
            Movie(R.drawable.cover2, "THE BOOK OF BOBA FETT",
                "petualangan boba fett.")
        )

        MovieList.add(
            Movie(R.drawable.cover9, "DAHMER",
                "kisah kanibal.")
        )

        MovieList.add(
            Movie(R.drawable.cover10, "THE BOYS",
                "kisah superhero.")
        )

        MovieList.add(
            Movie(R.drawable.cover3, "OBI WAN KENOBI",
                "kisah perjalanan obi wan.")
        )

        MovieList.add(
            Movie(R.drawable.cover16, "FORREST GUMP",
                "kisah perjalanan forrest.")
        )

        MovieList.add(
            Movie(R.drawable.cover5, "INTERSTELLAR",
                "kisah terjebak di blackhole.")
        )

        MovieRecyclerView = findViewById(R.id. MovieRecyclerView)
        MovieRecyclerView.setHasFixedSize(true)
        MovieRecyclerView.layoutManager = LinearLayoutManager(this)

        MovieAdapter =  MovieAdapter(MovieList)
        MovieRecyclerView.adapter = MovieAdapter
        MovieAdapter.onItemClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("Movie", it)
            startActivity(intent)
        }
    }
}