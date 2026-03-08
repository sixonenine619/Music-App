package com.example.songs

import retrofit2.Call
import retrofit2.http.Query
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiInterface {
    @Headers("x-rapidapi-key:aa025f85eemsh02b654338dc328ep1d1f30jsnd34638057492",
        "x-rapidapi-host:deezerdevs-deezer.p.rapidapi.com")

    @GET("search")
    fun getData(@Query("q") query: String) : Call<MyData>
}