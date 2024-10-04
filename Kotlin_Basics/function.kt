fun myFun() {
    println("My function")
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun information(name: String, age: Int): String {
    return "$name $age"
}

// Shorter Syntax for Return Values
fun myFunction(x: Int, y: Int) = x + y

fun main() {
    println("Hello World")
    myFun()

    println(add(5, 10))
    println(information("Sifat", 26))

    println(myFunction(7, 8))
}
