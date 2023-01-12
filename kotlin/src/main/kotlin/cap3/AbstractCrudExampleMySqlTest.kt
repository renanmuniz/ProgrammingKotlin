package cap3

fun main() {
    val mysqlExec = AbstractCrudExampleMySql()
    mysqlExec.save("mysq.database:3306.etc.etc...", "insert into abc values 123...")
}