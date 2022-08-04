package com.example.dota.dao

import com.example.dota.model.Movie
import retrofit2.Response
import retrofit2.http.GET

interface ApiServise {
    @GET("3/movie/top_rated?api_key=5250a97df6ac375b55bcd5780f4950b2&language=ru-US&page=1")
    suspend fun allMovies():Response<Movie>


}
