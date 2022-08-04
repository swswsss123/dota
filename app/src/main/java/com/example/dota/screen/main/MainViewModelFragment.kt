package com.example.dota.screen.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.dota.dao.RetrofitRealization
import com.example.dota.model.Movie
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModelFragment(application: Application): AndroidViewModel(application) {
    private val repository = RetrofitRealization()
    val myMovieList: MutableLiveData<Response<Movie>> = MutableLiveData() //иницилицация
    fun getMoviesRetrofit(){
        viewModelScope.launch {
            myMovieList.value = repository.getMovies() //укдадываем все наши фильмы и засовыем это все в lLiveData
        }
    }
}