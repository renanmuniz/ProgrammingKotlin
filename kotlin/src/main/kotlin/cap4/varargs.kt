package cap4

fun main() {
    multiprint("Renan", "Muniz", "Merlo")

    val nome = arrayOf("Renan", "Muniz", "Merlo")
    multiprint(*nome)  //se os argumentos estiverem em um array, usando o * antes, 'quebra' eles um a um.
}

fun multiprint(vararg strings: String) {
    for (string in strings)
        println(string)
}