
class Person {
    var name: String? = "Sifat"
    var age: Int? = 26
}

fun main() {
    /*#run:
      Property 1: Refer to the person object by using 'this'
      Property 2: The return value is the 'lambda result'

      Combination of with + let

      If you want to operate on a nullable object and avoid nullPointerException then use 'run'
      */

//    val person: Person = Person()
    // Making person object nullable
    val person: Person? = Person()

    // now if we want to work with a nullable object
    val container = person?.run {
        println(name)
        println(age)
        age!! + 5
        "hello, sifat"
    }

    println(container)
}
