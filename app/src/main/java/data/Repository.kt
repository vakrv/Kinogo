package data

interface Repository {

    fun getMoviesFromServer() : List<Category>
    fun getMoviesFromLocalStorage() : List<Category>
}