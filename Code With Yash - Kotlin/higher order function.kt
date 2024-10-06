// Kotlin Higher Order Function: Code With Yash
// Can accept function as a parameter, return function or do both
fun main() {
    // must put :: before function, not when using lambda function
    // in kotlin we treat an function as an object itself. like pass function inside a function, return a function, store a function inside a variable

    val myFun1 = higherOrder(12.0, 5.75, ::add) 
    println(myFun1) // myFun1 will get unit
    val myFun2 = higherOrder(12.0, 5.75, ::mul)
    val myFun3 = higherOrder(12.0, 5.75, ::sub)
    val myFun4 = higherOrder(12.0, 5.75, ::div)

    println(myFun1)
}
// normal functions
fun add(a: Double, b: Double): Double {
    return a + b
}
fun mul(a: Double, b: Double): Double {
    return a * b
}
fun sub(a: Double, b: Double): Double {
    return a - b
}
fun div(a: Double, b: Double): Double {
    return a / b
}
// passing function as a parameter
fun higherOrder(a: Double, b: Double, fn: (Double, Double) -> Double) {
    println(fn(a, b))
}
