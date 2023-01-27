package cap4

fun main() {

    var valor = 100.0
    println("Comissao: ${calculaComissao(valor)}")  //Comissao: 10.0

    valor = -10.0
    println("Comissao: ${calculaComissao(valor)}")  //IllegalArgumentException: Valor -10.0 inválido. Deve ser maior que zero.

}

fun calculaComissao(valor :Double) :Double {
    require(valor>0) {"Valor $valor inválido. Deve ser maior que zero."}
    return valor * 0.1
}


//Require throws an exception and it is used to ensure that arguments match the input conditions

//Assert throws an AssertionException exception and it is used to ensure that our internal state is consistent

//Check throws an IllegalStateException exception and it is also used for internal state consistency