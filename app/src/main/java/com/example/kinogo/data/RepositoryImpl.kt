package com.example.kinogo.data

class RepositoryImpl : Repository {

    private var movies: List<Movie> = listOf(
        Movie("Интерстеллар", 0, 86, "08 июль 2014"),//фантастика
        Movie("1+1", 1, 88, "07 июл 2011"),//драма
        Movie("Начало", 2, 78, "30 июн 2010"),//фантакстика
        Movie("Джентельмены", 3, 79, "01 июл 2019"),//криминал
        Movie("Зверополис", 4, 82, "30 июн 2016")
    )

    private var categories: List<Category> = listOf(
        Category("Фантастика", movies),
        Category("Драма", movies),
        Category("Криминал", movies),
        Category("Мультфильм", movies),
    )

    override fun getMoviesFromServer(): List<Category> = categories
    override fun getMoviesFromLocalStorage(): List<Category> = categories

}