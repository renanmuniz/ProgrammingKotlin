package cap4

fun main() {
    printInConsole()

    //Em kotlin, não há retorno nulo de funcoes, se nao tiver retorno explicito, retonar kotlin.Unit
    val functionsDefaultReturn = printInConsole()
    println(functionsDefaultReturn) //kotlin.Unit
}

fun printInConsole() {
    println("This is a function in Kotlin!")
}