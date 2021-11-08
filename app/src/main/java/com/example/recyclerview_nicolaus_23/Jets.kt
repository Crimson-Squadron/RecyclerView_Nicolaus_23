package com.example.recyclerview_nicolaus_23

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Jets(
    val imgJets: Int,
    val nameJets: String,
    val descJets: String
) : Parcelable
