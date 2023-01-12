package cap3

class OverridingOverrideExample : OverrideExample() {

    override fun logMessage(message : String) {
        println("OVERRIDED LOGGER: ${message}")
    }

}