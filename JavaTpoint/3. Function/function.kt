
fun main() {
//    var num = 25
//    var result = Math.sqrt( num.toDouble() )
//    print("Square root of $num is $result")

    var a: Int = Integer.valueOf(readLine())
    var b: Int = Integer.valueOf(readLine())

    println("Sum of $a and $b is: ${sum(a, b)}")
    println("Sub of $a and $b is: ${sub(a, b)}")
    println("Mul of $a and $b is: ${mul(a, b)}")
    println("Div of $a and $b is: ${div(a, b)}")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a - b
}

fun mul(a: Int, b: Int): Int {
    return a * b
}

fun div(a: Int, b: Int): Int {
    return a / b
}
