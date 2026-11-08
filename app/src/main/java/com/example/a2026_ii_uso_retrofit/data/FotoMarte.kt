package com.example.a2026_ii_uso_retrofit.data

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class FotoMarte (
    @SerializedName("id")
    val id: String,
    @SerializedName("img_src")
    val imgSrc: String
)