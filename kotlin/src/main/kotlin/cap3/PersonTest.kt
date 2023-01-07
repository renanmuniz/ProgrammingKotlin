package cap3

fun main() {
    val person1 = Person("Alex", "Smith", 32)
    val person2 = Person("Jane", "Smith", null)

    println("${person1.firstName}, ${person1.lastName}, ${person1.age}")
    println("${person2.firstName}, ${person2.lastName}, ${person2.age}")

//    val invalidPerson = Person("Joseph", "Smith", 160)  //IllegalArgumentExceptionException Invalid age argument.
//    println("${invalidPerson.firstName}, ${invalidPerson.lastName}, ${invalidPerson.age}")

    val personWithOtherConstructor = Person("Joseph", "Smith")
    println("${personWithOtherConstructor.firstName}, ${personWithOtherConstructor.lastName}, ${personWithOtherConstructor.age}")
    //Joseph, Smith, null


}