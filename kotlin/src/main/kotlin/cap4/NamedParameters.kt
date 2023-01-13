package cap4

fun main() {

    cadastrar(telefone = "43912345678", idade = 32, nome = "Renan", sobrenome = "Muniz")

}

fun cadastrar(nome :String, sobrenome :String, telefone :String, idade :Int) {
    println("Cadastrado: $nome $sobrenome, idade: $idade, telefone: $telefone")
}