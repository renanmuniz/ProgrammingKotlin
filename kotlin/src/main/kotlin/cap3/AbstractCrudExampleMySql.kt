package cap3

class AbstractCrudExampleMySql :AbstractCrudExample() {

    fun save(dbconnection: String, query: String) {
        println("MYSQL CONNECTION ESTABLISHED: $dbconnection")
        println("MYSQL EXECUTING: $query")
        exec(dbconnection,query)
    }

}