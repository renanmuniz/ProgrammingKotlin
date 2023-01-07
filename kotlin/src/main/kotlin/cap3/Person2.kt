package cap3


// Para nao gerar getter ou setter:
class Person2 (firstName: String, lastName: String, howOld: Int?, active: Boolean?){
    private val name: String //quando é private, não gera getter e setters
    private val age: Int? //quando é private, não gera getter e setters
    var active: Boolean? //quando não é private, gera getter e setters

    init {
        this.name = "$firstName,$lastName"
        this.age = howOld
        this.active = active
    }

    fun getName(): String = this.name //gerado 'na mão' o getter
    fun getAge(): Int? = this.age //gerado 'na mão' o getter
}