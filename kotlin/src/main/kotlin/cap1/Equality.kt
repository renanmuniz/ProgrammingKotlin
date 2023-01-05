package cap1

import java.io.File

fun main() {

    //referential equality:
    println("referential equality:")
    val a = File("src/main/kotlin/Cap1/textfile.txt")
    val b = File("src/main/kotlin/Cap1/textfile.txt")

    val sameRef = a === b
    println(sameRef)

    val notSameRef = a !== b
    println(notSameRef)


    //structural equality:
    println("structural equality:")
    val a2 = File("src/main/kotlin/Cap1/textfile.txt")
    val b2 = File("src/main/kotlin/Cap1/textfile.txt")

    val sameStructuralRef = a2 == b2
    println(sameStructuralRef)

    val notsameStructuralRef = a2 != b2
    println(notsameStructuralRef)


}