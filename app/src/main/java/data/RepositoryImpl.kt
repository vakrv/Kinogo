package data

import com.example.kinogo.R

class RepositoryImpl : Repository {


//    private var categories: List<Category> = listOf(
//        Category("Фантастика", movies),
//        Category("Драма", movies),
//        Category("Криминал", movies),
//        Category("Мультфильм", movies),
//    )

    override fun getMoviesFromServer(): List<Category>
    override fun getMoviesFromLocalStorage(): List<Category>

}