// Kotlin - Lambda Functions - Code With Yash
// Lambda: function with no name. Defined with Curly Braces: {}. Takes variable as a parameter (if any) and body of a function.
// The body of a function is written after variable (if any) followed by -> operator.

fun main() {
    val modOperation = { a: Int -> a % 2 == 0 }
    // {}: Start of lambda function
    // a: Parameter
    // Int: Data Type
    // ->: After this body of the function
    // a % 2 == 0: Even check

    println(modOperation) // prints nothing
    println(modOperation(5)) // false: odd
    println(modOperation(6)) // true: even

    // type inference
    val parityCheck = { n: Int -> n % 2 == 0 }

    // explicit type
    val parityCheckk: (Int) -> Boolean = { n: Int -> n % 2 == 0 }

    println(parityCheck(4))
    println(parityCheckk(5))

    val sum = {a: Int, b: Int -> a + b}
    val summ: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
    println(sum(2, 4))
    println(summ(21, 4))

    val mul = {a: Int, b: Int -> a * b}
    println(mul(2, 4))

    //    val output = higherOrder(2, 4, ::sum)
//    val output = higherOrder(2, 4, {a: Int, b: Int -> a + b})
    // if lambda function is the last parameter
    val output = higherOrder(2, 4) {a: Int, b: Int -> a + b}
    println(output)
}

// After using Lambda function this becomes redundant
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun higherOrder(a: Int, b: Int, fn: (Int, Int) -> Int): Int {
    println(fn(a, b))
    return fn(a, b)
}
