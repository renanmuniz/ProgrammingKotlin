package cap13

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

fun main() {

    val executor = Executors.newFixedThreadPool(3)
    for(n in 1..10) {
        executor.submit {
            println("Processando elemento $n na thread ${Thread.currentThread().name}")
            Thread.sleep(1000)
        }
    }

    //Esse bloco abaixo faz com que o processamento espero todas as threads terminarem antes do programa prosseguir:
    executor.shutdown()
    executor.awaitTermination(1,TimeUnit.MINUTES)
    //--------------------------------------------------------------------------------------------------------------

    println("Terminou")
}