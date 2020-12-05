package com.eman.mostarticalapp.domain.model

import com.google.gson.annotations.SerializedName
import java.io.*


data class Artical(
    @SerializedName("url")
    val url: String? = null,

    @SerializedName("adx_keywords")
    val adxKeywords: String? = null,

    @SerializedName("column")
    val column: Any? = null,

    @SerializedName("section")
    val section: String? = null,

    @SerializedName("byline")
    val byline: String? = null,

    @SerializedName("type")
    val type: String? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("abstract")
    val abstract: String? = null,

    @SerializedName("published_date")
    val publishedDate: String? = null,

    @SerializedName("source")
    val source: String? = null,

    @SerializedName("id")
    val id: Long? = null,

    @SerializedName("asset_id")
    val assetId: Long? = null,

    @SerializedName("views")
    val views: Int? = null,

    @SerializedName("media")
    val media: List<Media>? = null,

    var urlImg :String = ""

    ) : Serializable

