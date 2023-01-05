package cap1

fun main() {
    val aToZ = "a".."z"
    println("aToZ: $aToZ")

    val isTrueC = "c" in aToZ
    println(isTrueC)  //true

    val zeroToNine = 0..9
    println(zeroToNine)

    val isTrue0to9 = 5 in zeroToNine
    println(isTrue0to9)  //true

    val isFalse0to9 = 10 in zeroToNine
    println(isFalse0to9)  //false

    val countingDown = 100.downTo(0)
    println(countingDown)

    val rangeParesUsandoStep = 0.rangeTo(100).step(2)
    println(rangeParesUsandoStep)
    println(60 in rangeParesUsandoStep) //true
    println(33 in rangeParesUsandoStep) //false

    val rangeParesInvertidoUsandoStep = 0.rangeTo(100).step(2).reversed()
    println(rangeParesInvertidoUsandoStep)


}