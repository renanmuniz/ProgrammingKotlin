package cap7

fun main() {
    val location = "Brazil"
    val safeString: String? = location as? String
    println(safeString)  //Brazil

    val location2 = "Brazil"
    val safeInt: Int? = location as? Int   //caso o casting falhe, retorna null
    println(safeInt)   //null
}