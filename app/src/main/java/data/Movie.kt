package data

import com.example.kinogo.R

data class Movie(
    val category: Category = getDefaultCategory(),
    val image: Int,
    val rating: Int,
    val date: String
)

fun getDefaultCategory() = Category("Интерстеллар")

fun getDefaultCategories(): List<Movie> {
    return listOf(
        Movie(Category("Интерстеллар"), R.drawable.interstellar, 86, "08 июль 2014"),//фантастика
        Movie(Category("1+1"), 1, 88, "07 июл 2011"),//драма
        Movie(Category("Начало"), 2, 78, "30 июн 2010"),//фантакстика
        Movie(Category("Джентельмены"), 3, 79, "01 июл 2019"),//криминал
        Movie(Category("Зверополис"), 4, 82, "30 июн 2016")
    )
}