package cap3

import java.util.Date

class CardPayment(amount: Double, val number: String, val expiryDate: Date) : Payment(amount) {
}