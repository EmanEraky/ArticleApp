package com.eman.mostarticalapp.data.repo

import com.eman.mostarticalapp.domain.model.ArticalAll
import com.eman.mostarticalapp.utils.Resource
import kotlinx.coroutines.flow.Flow

interface ApiHelper {
    suspend fun getArtical(apikey :String): Flow<Resource<ArticalAll>>




}