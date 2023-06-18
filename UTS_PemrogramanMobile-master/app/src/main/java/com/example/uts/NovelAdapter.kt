package com.example.uts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NovelAdapter (private val context: Context, private val novel: List<FilmClass>, val listener: (FilmClass) -> Unit)
    : RecyclerView.Adapter<NovelAdapter.NovelViewHolder>(){
    class NovelViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val filmimg = view.findViewById<ImageView>(R.id.image)
        val filmname = view.findViewById<TextView>(R.id.tv_name)
        val filmyears = view.findViewById<TextView>(R.id.tv_date)
        val filmgenre = view.findViewById<TextView>(R.id.tv_author)
        val filmrate = view.findViewById<TextView>(R.id.tv_rating)
        val ratingbar = view.findViewById<RatingBar>(R.id.ratingbar)

        fun bindView(novel: FilmClass, listener: (FilmClass) -> Unit){
            filmimg.setImageResource(novel.filmimg)
            filmname.text = novel.filmname
            filmyears.text = novel.filmyears
            filmgenre.text = novel.filmgenre
            filmrate.text = novel.filmrate
            ratingbar.rating = novel.ratingbar.toFloat()
            itemView.setOnClickListener{
                (listener(novel))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NovelViewHolder {
        return NovelViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NovelViewHolder, position: Int) {
        holder.bindView(novel[position], listener)
    }

    override fun getItemCount(): Int = novel.size

}