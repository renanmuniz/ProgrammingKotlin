package cap5

fun main() {

    val ints = listOf(1,2,3,4,5)

    ints.forEach {
        if (it % 2 == 0) {
            println("$it é par")
        } else {
            println("$it é impar")
        }
    }

}

