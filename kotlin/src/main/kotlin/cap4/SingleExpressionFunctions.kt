package cap4

fun main() {
    println(square(3))  //9
    println(sum(2,3)) //5
    log("Erro ao fazer operacao.")

    println(divide3(10.0,2.0))
    println(divide3(10.0,0.0))


}

fun square(k: Int) = k * k

fun sum(n: Int, m: Int) = n + m

fun log(msg: String) = println("info: $msg")

fun divide(a: Double, b: Double) :Double{
    require(b > 0, { "b should be greater than zero" })  //require é usado para validacoes.
    return a/b
}

fun divide2(a: Double, b: Double) :Double{
    check(b>0)
    return a/b
}

fun divide3(a: Double, b: Double) :Double{
    error(b==0.0)
    return a/b
}