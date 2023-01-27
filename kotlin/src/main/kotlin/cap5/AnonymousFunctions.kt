package cap5

fun main() {
    val ints = listOf(1, 2, 3)
    val evens = ints.filter(fun(k: Int) = k % 2 == 0)
    println(evens)
}