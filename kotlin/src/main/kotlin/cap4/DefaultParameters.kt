package cap4

fun main() {
    setThreads()
    setThreads(2)
    setThreads(4)
    setThreads(8)
}

fun setThreads(threads: Int = 1) {
    println("Setting threads number to: $threads")
}