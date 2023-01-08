package cap3

// Para usar 'metodos estaticos' crie um kotlin file e declare funcoes nele.

fun showFirstCharacter(input:String):Char{
    if(input.isEmpty()) throw IllegalArgumentException()
    return input.first()
}

fun showLastCharacter(input:String):Char{
    if(input.isEmpty()) throw IllegalArgumentException()
    return input.last()
}