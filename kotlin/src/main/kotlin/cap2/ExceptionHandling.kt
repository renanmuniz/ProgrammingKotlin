package cap2

import java.io.File
import java.lang.Exception

fun main() {
    println("Aqui o arquivo existe e é lido:")
    readFile("src/main/kotlin/Cap1/textfile.txt")

//    println("Mas e se não existir?")
//    readFile("src/main/kotlin/Cap1/fileThatDoesntExists.txt")
    //Exception in thread "main" java.io.FileNotFoundException: src/main/kotlin/Cap1/fileThatDoesntExists.txt (No such file or directory)

    println("Mas e se não existir?")
    println("Tratando a exception:")
    val file = "src/main/kotlin/Cap1/fileThatDoesntExists.txt"
    try {
        readFile(file)
    } catch (e: Exception) {
        println("Erro ao ler arquivo: ${e.message}")
    } finally {
        println("Não conseguiu ler o arquivo: $file")
    }
}

fun readFile(fileName: String) = File(fileName).forEachLine { println(it) }
