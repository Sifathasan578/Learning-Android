/*
* try, catch, finally, throw
*
* // Syntax of try with catch block
*   try{
        //code that may throw exception
    } catch(e: SomeException){
        //code that handles exception
    }

    try{
        //code that may throw exception
    } finally {
        // code finally block
    }
    try {
        // some code
    }
    catch (e: SomeException) {
        // handler
    }
    finally {
        // optional finally block
    }
*/

fun main() {
    *//*val data = 20 / 0
    println(data)*//*

    try {
        val data = 20 / 0
        println(data) // will not print
    }
    catch (e:ArithmeticException) {
        println(e)
    }
    println("Code below exception")


}

fun main() {
    val str = getNumber("10")
    println(str)
}

fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    }
    catch(e: ArithmeticException) {
        0
    }
}

// NumberFormatException
fun main() {
    val str = getNumber("10.5")
    println(str)
}

fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    }
    catch(e: NumberFormatException) {
        0
    }
}
