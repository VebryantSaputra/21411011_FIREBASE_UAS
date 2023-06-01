package com.example.a21411011_tugas_logincontent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val MovieList: ArrayList<Movie>):RecyclerView.Adapter<MovieAdapter.ImageViewHolder>(){

    var onItemClick : ((Movie) -> Unit)? = null

    class ImageViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id._image)
        val imageTitle : TextView = itemView.findViewById(R.id._title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,
            false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return MovieList.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val Movie = MovieList[position]
        holder.imageView.setImageResource(Movie.imageSource)
        holder.imageTitle.text = Movie.ImageTitle

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(Movie)
        }
    }
}