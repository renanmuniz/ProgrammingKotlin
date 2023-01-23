package cap4

fun main() {
    val account = InfixAccount()
    println(account.balance)

    account add 100.0

    println(account.balance)
}