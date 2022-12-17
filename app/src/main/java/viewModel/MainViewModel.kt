package viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import data.Repository
import data.RepositoryImpl
import repository.AppState

class MainViewModel(
    private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData(),
    private val repositoryImpl: Repository = RepositoryImpl()
) : ViewModel() {


    fun getLiveData() = liveDataToObserve;
    fun getMoviesFromLocalSource() {
        liveDataToObserve.value = AppState.Loading
        Thread {
            Thread.sleep(1000)
            liveDataToObserve.postValue(AppState.Success(repositoryImpl.getMoviesFromLocalStorage()))
        }.start()
    }

    fun getMoviesFromRemoteSource() {
        liveDataToObserve.value = AppState.Loading
        Thread {
            Thread.sleep(1000)
            liveDataToObserve.postValue(AppState.Success(repositoryImpl.getMoviesFromServer()))
        }.start()
    }
}