package cap1

import java.io.File
import java.math.BigDecimal

fun main() {
    //Kotlin não precisa da palavra new para instaciar uma classe.
    //ele ja utiliza o construtor padrão da classe intrinsicamente.

    val salario = BigDecimal.valueOf(5000.00)
    println(salario)
    println(salario.javaClass.name)

    val file = File("src/main/kotlin/Cap1/textfile.txt")
    println(file.name)

}