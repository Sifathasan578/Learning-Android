// throw: used to throw an explicit exception. It is used to throw a custom exception.

fun main() {
    validate(15)
    println("Code after validation()")
}

fun validate(age: Int) {
    if(age < 18) {
        throw ArithmeticException("Under Age")
        // Maybe a circumstances occur when I might not want to work with underage people
    }
    else {
        println("Eligible for drive")
    }
}
