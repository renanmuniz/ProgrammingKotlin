package cap10

fun main() {
    val map = mutableMapOf(1 to "Um", 2 to "Dois", 3 to "Três")
    for(key in map.keys) {
        println("Chave: $key - Valor: ${map[key]}")
    }

    println("\n---\n")

    map.put(4,"Quatro")
    for(key in map.keys) {
        println("Chave: $key - Valor: ${map[key]}")
    }


}