package cap3

fun main() {
    val person1 = Person2("Alex", "Smith", 32, true)

//    person1.setName()  //Nao existe setter
//    person1.setAge()  //Nao existe setter

    println("${person1.getName()},${person1.getAge()}, ${person1.active}")
    person1.active = false
    println("${person1.getName()},${person1.getAge()}, ${person1.active}")


}