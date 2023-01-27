package cap5

fun main() {
    fun isEven(n: Int) :Boolean = n % 2 == 0

    val ints = listOf(1,2,3,4,5,6)
    println(ints.filter { isEven(it) })
    //ou:
    println(ints.filter(::isEven))


    fun Int.isOdd() : Boolean = this % 2 != 0  //atrelou uma funcao ao tipo Int que pode ser chamada em qlqer valor deste tipo
    println(1.isOdd()) //true
    println(2.isOdd()) //false

}