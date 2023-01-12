package cap3

import java.time.Instant
import java.util.Date

fun main() {
    var cardPayment =  CardPayment(100.0, "123456", Date.from(Instant.now()))
    println(cardPayment.amount)
    println(cardPayment.number)
    println(cardPayment.expiryDate)
}