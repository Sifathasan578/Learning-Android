class Person {
    var name: String? = null
    var age: Int? = null
}

fun main() {
//    val person = Person()
//    person.name = "sifat"
//    person.age = 26

//    #apply:
//      Property 1: Refer to the person object by using 'this'
//      Property 2: The return value is the 'context object'

    // even works when this is not used
    // object returns, code reusability reduces, this used which is optional
    val person = Person().apply {
//        this.name = "Sifat"
//        this.age = 26

        name = "Sifat"
        age = 26
        // object return kore, not last statement
    }

    // now you can use the with function to print the value
    var str = with(person) {
        println(name)
        println(age)

        "last statement returned"
    }
    println(str)
}
