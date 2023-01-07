package cap3

import java.time.LocalDateTime

fun main() {
    val msg = MessageDataClass("this is a text for the message", LocalDateTime.now())
    println(msg)
}