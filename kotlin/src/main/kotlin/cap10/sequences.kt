package cap10

fun main() {

    val seq = sequenceOf("um", "dois", "tres", "quatro", "cinco")
    seq.forEach { println(it) }

    println(seq.count())
    println(seq.first())
    println(seq.last())

}