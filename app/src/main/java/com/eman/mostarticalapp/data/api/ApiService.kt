package com.eman.mostarticalapp.data.api

import com.eman.mostarticalapp.domain.model.Artical
import com.eman.mostarticalapp.domain.model.ArticalAll
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("viewed/1.json")
    suspend fun getArtical(@Query ("api-key") apikey :String ): ArticalAll



}