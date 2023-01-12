package cap3

open class OverrideExample {
    open fun logMessage(message : String) {
        println("LOGGER: ${message}")
    }
}