package cap3

class Person(val firstName: String, val lastName: String, val age: Int?) {
    //Para incluir código a ser executado ao criar o objeto da classe:
    init {
//        println("Executando bloco inicializador.")
        require(firstName.trim().length > 0) { "Invalid firstName argument." }
        require(lastName.trim().length > 0) { "Invalid lastName argument." }
        if (age != null) {
            require(age >= 0 && age < 150) { "Invalid age argument." }
        }
    }

    constructor(firstName: String, lastName: String) : this(firstName, lastName, null)

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName', age=$age)"
    }


}