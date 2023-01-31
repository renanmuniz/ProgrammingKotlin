package cap7

import java.util.*

fun main() {
    var optionalName: Optional<String> = Optional.of("william")
    println(optionalName)  //Optional[william]
    println(optionalName.get())  //william

    println(optionalName.isEmpty)   //false
    println(optionalName.isPresent)   //true
}