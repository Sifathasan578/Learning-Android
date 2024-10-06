
class Person {
    var name: String? = null
    var age: Int? = null
}

fun main() {
/*#let:
      Property 1: Refer to the person object by using 'it'
      Property 2: The return value is the 'lambda result'*/


    // Generally we use 'let' function to avoid 'NullPointerException'
    // not null assertion operator: !!
    val name: String? = "Sifat"

    // along with null you must use safe call operator/ elvis operator
    // elvis operator: ?.
    val strLen = name?.let {
        // executes this block of code only if name is not null
        println(it.reversed())
        println(it.uppercase())
//        println(it.length)

        // returns lambda body
        name.length
    }
    println("Returned string: $strLen")

//    println(name!!.reversed()) // will show an error
//    println(name.length)
}
