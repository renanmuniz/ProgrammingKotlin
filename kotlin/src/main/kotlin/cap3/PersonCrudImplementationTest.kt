package cap3

fun main() {
    val personCrudImplementation = PersonCrudImplementation()
    personCrudImplementation.find(1L)
    personCrudImplementation.save(Person("Renan","Muniz"))
    personCrudImplementation.delete(Person("Renan","Muniz"))
    personCrudImplementation.update(Person("Renan","Merlo"))

}