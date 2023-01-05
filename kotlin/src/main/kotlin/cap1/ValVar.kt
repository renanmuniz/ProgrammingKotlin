package cap1

fun main() {
    //val é imutavel:
    val cidade = "Londrina"
    println("Cidade: $cidade")

//    cidade = "São Paulo"  Erro. Val não pode mudar o valor e deve ser inicializada assim que declarada.

    //var é mutável e pode ser inicializada depois:
    var mutavel = 0
    println("Var Antes: $mutavel")
    mutavel = 1
    println("Var Depois: $mutavel")

    var cor = "azul"
    cor = "branco"
    println("Cor: $cor")

    var nome: String
    //println("Antes: $nome")  //como está nulo dá erro de compilação. Val deve ser inicializado.
    nome = "Renan"
    println("Val Nome: $nome")
}