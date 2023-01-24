package cap4

fun main() {
    val a = 10
    val b = 2

    println(a.minus(b))
    println(a.plus(b))
    println(a.times(b))
    println(a.div(b))
    println(a.mod(b))

    val ints = arrayOf(1,2,3,4,5)
    println(0 in ints)
    println(3 in ints)
    println(3 !in ints)
    println(ints.contains(1))
    println(ints.contains(99))
}