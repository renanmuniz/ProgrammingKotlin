package cap1

import java.time.LocalDate

fun main() {
    val date = LocalDate.now()
    val today = if (date.year == 2023) true else false
    println("Year is 2023? $today")

    fun isZero(x: Int): Boolean {
        return if (x == 0) true else false
    }

    val zero = 0
    val um = 1
    val dois = 2

    println(isZero(zero))
    println(isZero(um))

    fun isPar(x: Int): Boolean {
        return x%2==0
    }

    println("$um é par? ${isPar(um)}")
    println("$dois é par? ${isPar(dois)}")

}