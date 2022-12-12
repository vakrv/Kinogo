package com.example.kinogo.data

interface Repository {

    fun getMoviesFromServer() : List<Category>
    fun getMoviesFromLocalStorage() : List<Category>
}