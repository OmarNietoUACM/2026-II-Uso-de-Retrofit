package com.example.a2026_ii_uso_retrofit.data

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface FotosMarteAPIServicio {
    @GET("photos")
    suspend fun getFotos(): Response<List<FotoMarte>>
}


class FotoMarteAPIDataSource {

    companion object{
        val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com/"

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val servicio by lazy {
            FotoMarteAPIDataSource.retrofit.create(FotosMarteAPIServicio::class.java)
        }
    }

}