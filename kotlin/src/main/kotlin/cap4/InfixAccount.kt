package cap4

class InfixAccount {
    var balance = 0.0
    infix fun add(amount: Double): Unit {
        this.balance = balance + amount
    }
}