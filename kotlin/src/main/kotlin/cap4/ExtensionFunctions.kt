package cap4

fun main() {

    val nome = "Renan"
    println(nome.retornaPrimeiro())  //R
    println(nome.retornaUltimo())  //n

}

fun String.retornaPrimeiro() : Char {
    return this[0]
}

fun String.retornaUltimo() : Char {
    return this[this.length-1]
}