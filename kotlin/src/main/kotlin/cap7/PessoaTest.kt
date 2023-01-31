package cap7

fun main() {
    var pessoa: Pessoa? = Pessoa("Renan","Muniz",null)

    var name: String? = null
    name = pessoa?.firstName
    println(name)

    pessoa = null
    name = pessoa?.firstName  //não gera exception de nullpointer
    println(name)  //null


    //forcando a passagem de um posivel nulo:
    val nullableName: String? = "george"
    val name2: String = nullableName!!  //usa o !! para forcar o compilado a aceitar o comando

    //var pessoa2: Pessoa = pessoa //não aceita
//    var pessoa2: Pessoa = pessoa!! //aceita  "Assumimos a responsabilidade dessa atribuicao"
//    println(pessoa2.firstName)   // e gerou uma Exception in thread "main" java.lang.NullPointerException


    //Elvis operator:
    val nullablePerson: Pessoa? = null
    val lastName: String = nullablePerson?.lastName ?: "default_lastname"
    println(lastName)  //default_lastname

}