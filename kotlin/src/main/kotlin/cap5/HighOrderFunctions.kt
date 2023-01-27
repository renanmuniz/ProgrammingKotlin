package cap5

fun main() {
    foo("Hello", {it.reversed()})
    foo("Renan", {it.drop(1)})
    foo("Renan", {it.drop(2)})
    foo("Renan", {it.first().toString()})


    val ints = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val odds = ints.filter { it % 2 == 1 }
    val evens = ints.filter { it % 2 == 0 }

    println(odds)
    println(evens)


    val reverse = bar()
    println(reverse("Renan"))

}

fun foo(str: String, fn: (String) -> String): Unit {
    val applied = fn(str)
    println(applied)
}

fun bar(): (String) -> String = { str -> str.reversed() }

