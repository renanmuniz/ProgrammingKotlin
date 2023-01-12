package cap3

abstract class AbstractCrudExample {
    fun exec(dbconnection: String, query: String) {
        println("...executing: $query in dbconnection: $dbconnection")
    }
}