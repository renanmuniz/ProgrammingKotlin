package cap4

fun main() {

    val printHello = { println("Hello!")}
    printHello()

    val printMessage = {msg:String -> println(msg)}
    printMessage("Teste imprimindo mensagem passada por parametro por funcao literal")

    val printMessage2 = {msg :String? -> println(msg)}  //permitindo nulo
    printMessage2(null)  //passando nulo

}