package com.example.uts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FilmClass(
    val filmimg: Int,
    val filmname: String,
    val filmyears: String,
    val filmgenre: String,
    val filmdesc: String,
    val filmrate: String,
    val ratingbar: Double
) : Parcelable