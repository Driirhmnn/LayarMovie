package com.example.uts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tombol = findViewById<Button>(R.id.button)
        tombol.setOnClickListener {
            val url = "https://www.netflix.com/id/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val film = intent.getParcelableExtra<FilmClass>(MainActivity.INTENT_PARCELABLE)

        val filmimg = findViewById<ImageView>(R.id.image)
        val filmname = findViewById<TextView>(R.id.tv_name)
        val filmyears = findViewById<TextView>(R.id.tv_date)
        val filmgenre = findViewById<TextView>(R.id.tv_author)
        val filmrate = findViewById<TextView>(R.id.tv_rating)
        val ratingbar = findViewById<RatingBar>(R.id.ratingbar)
        val filmdesc = findViewById<TextView>(R.id.tv_description)

        filmimg.setImageResource(film?.filmimg!!)
        filmname.text = film.filmname
        filmyears.text = film.filmyears
        filmgenre.text = film.filmgenre
        filmrate.text = film.filmrate
        ratingbar.rating = film.ratingbar.toFloat()
        filmdesc.text = film.filmdesc
    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true
    }
}