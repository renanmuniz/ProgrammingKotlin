package Cap1

fun main() {

    //Numericos:
    val int = 123
    val long = 123456L
    val double = 12.34
    val float = 12.34F
    val hexadecimal = 0xAB
    val binary = 0b01010101


    //Booleano:
    val x = 1
    val y = 2
    val z = 3

    val isTrue = x < y && x < z
    val alsoTrue = x == y || y == z
    val isFalse = y < x

    println("isTrue: $isTrue")
    println("alsoTrue: $alsoTrue")
    println("false: $isFalse")


    //Char:
    val a = 'a'
    println(a.javaClass.name)

    val escapeChar = '\n'
    println(escapeChar.javaClass.name)


    //String:
    val isAString = "olá mundo Kotlin!"
    println(isAString.javaClass.name)

    val rawStrings = """   Isso é uma string especial,
        em que o texto pode ser escrito em várias linhas.
        Sem precisar de caracteres especiais para formatar.
    """.trimMargin()

    println(rawStrings)


    //Arrays:

    val array = arrayOf(1,2,3)
    println(array[0])
    println(array[1])
    println(array[2])

    var arrayMutavel = arrayOf(5,6,7)
    println(arrayMutavel[0])
    println(arrayMutavel[1])
    println(arrayMutavel[2])
    arrayMutavel[0] = 8
    arrayMutavel[1] = 9
    arrayMutavel[2] = 10
    println(arrayMutavel[0])
    println(arrayMutavel[1])
    println(arrayMutavel[2])

}