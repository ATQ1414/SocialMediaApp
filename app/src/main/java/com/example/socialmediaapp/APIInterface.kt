package com.example.socialmediaapp


import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("post/")
    fun getPost():Call<Posts>
    // so the @Query take every part of the rest URL

}
