package cap10

fun main() {

    val list1: List<Int> = listOf(1,2,3,4,5)
    list1.forEach { println(it) }

    val list2 = listOf("um", "dois", "tres", "quatro", "cinco")
    list2.forEach { println(it) }

    println(list2[0])
    println(list2[4])
//    println(list2[5])  //index out of bounds exception

    val list3 = mutableListOf(1,2,3,4,5)
    list3.remove(3)
    list3.forEach{ println(it)}
    list3.add(6)
    list3.forEach{ println(it)}

}