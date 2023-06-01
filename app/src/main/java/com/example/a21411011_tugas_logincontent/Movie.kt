package com.example.a21411011_tugas_logincontent

import android.os.Parcel
import android.os.Parcelable

data class Movie(val imageSource:Int, val ImageTitle: String, val imageDecs: String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imageSource)
        parcel.writeString(ImageTitle)
        parcel.writeString(imageDecs)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}
