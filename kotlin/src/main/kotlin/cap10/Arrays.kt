package cap10

fun main() {
    val intArray = arrayOf(1,2,3,4)
    println(intArray)
    println(intArray[0])
    println(intArray[3])
//    println(intArray[4]) //lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    println("---------")
    for(n in intArray) {
        println(n)
    }

    println(intArray.first())
    println(intArray.last())

    println("---------")
    var mutableIntArray = mutableListOf<Int>(5,6,7,8)
    for(n in mutableIntArray) {
        println(n)
    }

    mutableIntArray.remove(6)
    mutableIntArray.add(9)

    println("---------")
    for(n in mutableIntArray) {
        println(n)
    }

}