package ru.suslovalex.hackathonautorisation.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Team(
    val name: String? = null,
    val description: String? = null,
    val creator:String? = null)
//    val participants: List<User>? = null)
    :Parcelable