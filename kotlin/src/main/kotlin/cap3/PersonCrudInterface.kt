package cap3

interface PersonCrudInterface {
    fun find(id: Long) : Person
    fun save(person: Person) : Boolean
    fun delete(person: Person) : Boolean
    fun update(person: Person) : Boolean
}