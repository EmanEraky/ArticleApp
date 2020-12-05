package com.eman.mostarticalapp.domain.usecases

import com.eman.mostarticalapp.data.repo.ApiHelper
import javax.inject.Inject

open class getMainArticalUseCase @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getArtical(apikey: String) =
        apiHelper.getArtical(apikey)


}