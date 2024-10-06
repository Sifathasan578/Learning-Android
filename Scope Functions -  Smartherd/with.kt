class Person {
    var name: String? = "sifat"
    var age: Int? = 26
}

fun main() {
//    #with:
//      Property 1: Refer to the person object by using 'this'
//      Property 2: The return value is the 'lambda result'

    // normal
    val person = Person()
//    println(person.name)
//    println(person.age)

    // this: refers to the person object
    val container = with(person) {
//        println(this.name)
//        println(this.age)

        // This will also work
        println(name)
        println(age)

        // with returns last statement which is lambda body
        age!! + 5
        "hello, sifat"
    }

    println(container)
}
