package cap2

fun main() {

    //Kotlin tem inferencia de tipo ao se atribuir o primeiro valor para aquela var ou val:

    val tipoInferidoInt = 123
    println(tipoInferidoInt.javaClass.name)  //int

    val tipoInferidoString = "Olá mundo!"
    println(tipoInferidoString.javaClass.name) //java.lang.String

    val tipoInferidoDouble = 150.5
    println(tipoInferidoDouble.javaClass.name) //double

    val tipoInferidoBoolean = true
    println(tipoInferidoBoolean.javaClass.name) //boolean

}