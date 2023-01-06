package cap2

fun main() {
    whatNumber(0)
    whatNumber(1)
    whatNumber(2)

    println(isZeroOrOne(0))
    println(isZeroOrOne(1))
    println(isZeroOrOne(2))

    whenWithoutArgs(0,1)
    whenWithoutArgs(1,0)
    whenWithoutArgs(1,1)

}

fun whatNumber(x: Int) {
    when (x) {
        0 -> println("x is zero")
        1 -> println("x is one")
        else -> println("x is neither 0 or 1")
    }
}

fun isZeroOrOne(x: Int): Boolean {
    return when (x) {
        0, 1 -> true
        else -> false
    }
}

fun whenWithoutArgs(x: Int, y: Int) {
    when {
        x < y -> println("x is less than y")
        x > y -> println("X is greater than y")
        else -> println("X must equal y")
    }
}