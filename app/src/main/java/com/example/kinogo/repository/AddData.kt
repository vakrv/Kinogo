package com.example.kinogo.repository

import com.example.kinogo.data.Category

sealed class AppState {
    data class Success(val listCategory: List<Category>) : AppState()
    data class Error(val error: Unit) : AppState()
    object Loading : AppState()
}
