package cap4

fun main() {
    printRepeated("Renan",10)
    printRepeated(5,10)
    printRepeated(5.0,10)

}

fun <T> printRepeated(t: T, k: Int): Unit {
    for (x in 0..k) {
        println(t)
    }
}