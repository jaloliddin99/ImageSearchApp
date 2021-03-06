package com.codinginflow.imagesearchapp.api

import androidx.viewbinding.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    companion object{
        const val BASE_URL="https://api.unsplash.com/"
        const val CLIENT_ID="zJxSBX9F_LerOPqOHWXq_Zc2cym80klp6wV_J8qNhXo"
    }

    @Headers(
        "Accept-Version: v1",
        "Authorization: Client-ID $CLIENT_ID")

    @GET("search/photos")
    suspend fun searchPhotos(
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): UnsplashResponse


}