package com.eman.mostarticalapp.domain.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MediaMetadatum(
    @SerializedName("url")
    val url: String? = null,

    @SerializedName("format")
    val format: String? = null,

    @SerializedName("height")
    val height: Int? = null,

    @SerializedName("width")
    val width: Int? = null

): Serializable
