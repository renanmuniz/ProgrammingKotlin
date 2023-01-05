package cap1

fun main() {
    println("While:")
    var x = 0
    while(x<10) {
        println("x is: $x")
        x++
    }

    println("For:")
    val list = listOf(1,2,3,4,5,6,7,8,9)
    for(n in list) {
        println(n)
    }

    println("For using range:")
    for(n in 1..5) {
        println(n)
    }

    println("For using range:")
    val oneToTen = 1..10
    for(n in oneToTen) {
        println(n)
    }

    println("For in Strings")
    val spellMyName = "Renan Muniz Merlo"
    for(char in spellMyName) {
        println(char)
    }

    println("Index:")
    val arrayOfNumbers = arrayOf(1,2,3,4,5,6,7,8,9,0)
    for(index in arrayOfNumbers.indices) {
        println("Elemento $index é ${arrayOfNumbers[index]}")
    }
}