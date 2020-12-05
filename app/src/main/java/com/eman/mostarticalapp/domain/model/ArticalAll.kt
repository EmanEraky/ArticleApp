package com.eman.mostarticalapp.domain.model

import com.google.gson.annotations.SerializedName

class ArticalAll {
    @SerializedName("results")
    val results = mutableListOf<Artical>()

    @SerializedName("num_results")
    val num_results: Int = 0
}