package com.example.kinogo.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kinogo.repository.AppState

class MainViewModel (private val liveDataToObserve : MutableLiveData<AppState> = MutableLiveData())
    : ViewModel() {

}