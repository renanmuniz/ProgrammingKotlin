package cap3

class PersonCrudImplementation : PersonCrudInterface {
    override fun find(id: Long): Person {
        println("PersonCrudImplementation.find() - $id")
        return Person("Renan", "Muniz")
    }

    override fun save(person: Person): Boolean {
        println("PersonCrudImplementation.save() - $person")
        return true
    }

    override fun delete(person: Person): Boolean {
        println("PersonCrudImplementation.delete() - $person")
        return true
    }

    override fun update(person: Person): Boolean {
        println("PersonCrudImplementation.update() - $person")
        return true
    }

}