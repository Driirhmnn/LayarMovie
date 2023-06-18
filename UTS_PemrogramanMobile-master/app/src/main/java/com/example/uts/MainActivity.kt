package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animeList = listOf<FilmClass>(
            FilmClass(
                R.drawable.film1,
                filmname = "The Conjuring",
                filmyears = "Tahun Terbit: \n2013",
                filmgenre = "Genre: \nHorror",
                filmrate = "Rating: (7,5)",
                ratingbar = 4.5,
                filmdesc = "Sinopsis: \nKetika suami istri Rod dan Carolyn menyadari bahwa keluarga mereka tengah diganggu oleh roh jahat - keduanya pun akhirnya meminta bantuan pada pasangan ahli supranatural untuk menyelidiki masalah ini."
            ),
            FilmClass(
                R.drawable.film2,
                filmname = "The Conjuring 2",
                filmyears = "Tahun Terbit: \n2016",
                filmgenre = "Genre: \nHorror",
                filmrate = "Rating: (7,3)",
                ratingbar = 4.5,
                filmdesc = "Sinopsis: \nSuami istri yang juga adalah pengusir setan Lorraine dan Ed Warren memutuskan pergi ke utara London demi membantu sebuah keluarga yang rumahnya selalu dihantui oleh roh jahat."
            ),
            FilmClass(
                R.drawable.film3,
                filmname = "The Conjuring: The Devil Made Me Do It",
                filmyears = "Tahun Terbit: \n2021",
                filmgenre = "Genre: \nHorror",
                filmrate = "Rating: (6,3)",
                ratingbar = 4.5,
                filmdesc = "Sinopsis: \nKisah mengerikan tentang teror, pembunuhan, dan kejahatan tak diketahui sebelumnya kisah yang mengejutkan bahkan dialami oleh keluarga Ed dan Lorraine Warren. Salah satu kasus paling sensasional dari arsip penyelidikan mereka, dimulai dengan pertarungan untuk jiwa seorang anak laki-laki, kemudian membawa mereka kepada seuatu yang belum pernah mereka lihat dan alami sebelumnya,"
            ),
            FilmClass(
                R.drawable.film4,
                filmname = "Jhon Wick",
                filmyears = "Tahun Terbit: \n2014",
                filmgenre = "Genre: \n Action, Crime, Thriller",
                filmrate = "Rating: (7,4)",
                ratingbar = 4.5,
                filmdesc = "Sinopsis: \nJohn Wick, mantan pembunuh bayaran, berduka atas kematian istrinya. Tapi, ia terpaksa kembali ke dunia hitam setelah kelompok gangster Rusia mencuri mobil dan membunuh anak anjing warisan istrinya."
            ),
            FilmClass(
                R.drawable.film5,
                filmname = "Jhon Wick: Chapter 2",
                filmyears = "Tahun Terbit: \n2017",
                filmgenre = "Genre: \nAction, Crime, Thriller",
                filmrate = "Rating: (7,4)",
                ratingbar = 4.5,
                filmdesc = "Sinopsis: \nSetelah memutuskan kembali terjun ke dunia kejahatan bawah tanah, John Wick mendapati musuhnya telah menjanjikan sejumlah hadiah besar bagi yang bisa menghabisi nyawanya. Para pembunuh pun memburunya."
            ),
            FilmClass(
                R.drawable.film6,
                filmname = "Jhon Wick: Chapter 3 - Parabellum",
                filmyears = "Tahun Terbit: \n2019",
                filmgenre = "Genre: \nAction, Crime, Thriller",
                filmrate = "Rating: (7,4)",
                ratingbar = 4.5,
                filmdesc = "Sinopsis: \nSeri ketiga \"John Wick\" ini akan mengisahkan kelanjutan nasib si pembunuh bayaran usai menghabisi nyawa anggota High Table dalam The Continental. Ia sendiri diburu dan hidupnya dihargai sebesar USD 14 juta (sekitar Rp 201 miliar). Diburu oleh berbagai pembunuh bayaran hebat, John akan dibantu oleh karakter baru yang misterius bernama Sofia (Halle Berry)."
            ),
            FilmClass(
                R.drawable.film7,
                filmname = "Jhon Wick: Chapter 4",
                filmyears = "Tahun Terbit : \n2023",
                filmgenre = "Genre: \nAction, Crime, Thriler",
                filmrate = "Rating: (8,1)",
                ratingbar = 4.5,
                filmdesc = "Sinopsis: \nJohn Wick (Keanu Reeves) menemukan jalan untuk mengalahkan The High Table. Tapi sebelum dia bisa mendapatkan kebebasannya, Wick harus berhadapan dengan musuh baru dengan aliansi yang kuat di seluruh dunia! Memaksanya mengubah teman lama menjadi musuh."
            ),
            FilmClass(
                R.drawable.film8,
                filmname = "How to Train Your Dragon: The Hidden World",
                filmyears = "Tahun Terbit: \n2019",
                filmgenre = "Genre: \nAnimation, Action, Advanture",
                filmrate = "Rating: (7,4)",
                ratingbar = 4.5,
                filmdesc = "Sinopsis: \nDi film ketiganya ini akan berkisah tentang Hiccup (Jay Baruchel) yang berusaha memenuhi impiannya untuk menciptakan sebuah negeri impian bagi para Viking dan naga"
            ),
            FilmClass(
                R.drawable.film9,
                filmname = "Guardian of the Galaxy Vol. 3",
                filmyears = "Tahun Terbit: \n2023",
                filmgenre = "Genre: \nAction, Adventure, Comedy",
                filmrate = "Rating: (8,2)",
                ratingbar = 4.0,
                filmdesc = "Sinopsis: \nFilm ketiga akan melanjutkan kisah petualangan Peter Quill/Star Lord (Chris Pratt) dan teman-temannya sebagai penjaga galaksi.Masih berduka karena kehilangan Gamora (Zoe Saldana), Peter mengumpulkan timnya untuk kembali melindungi alam semesta. Misi kali ini tidaklah mudah, jika tidak berhasil, maka akan menjadi akhir bagi para Guardians."
            ),
            FilmClass(
                R.drawable.film10,
                filmname = "Marmut Merah Jambu",
                filmyears = "Tahun Terbit: \n2014",
                filmgenre = "Genre: \nComedy, Romance",
                filmrate = "Rating: (6,8)",
                ratingbar = 4.0,
                filmdesc = "Sinopsis: \nDika menceritakan kisah cinta pertamanya saat SMA dengan cewek bernama Ina Mangunkusumo. Cerita ketika dia dan temannya Bertus membentuk sebuah grup detektif, dan juga persahabatannya dengan Cindy."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = NovelAdapter(this, animeList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}