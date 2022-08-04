package com.example.dota.dao

import com.example.dota.model.Movie
import retrofit2.Response

class RetrofitRealization {

    suspend fun getMovies():Response<Movie>{
        return RetrofitInstance.api.allMovies()
    }
}