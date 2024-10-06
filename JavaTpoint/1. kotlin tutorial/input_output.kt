import java.util.Scanner // To input other data type rather than String

fun main() {
//    println("Hello World!")
//    print("Welcome to  JavaTpoint")
//
//    println(10)
//    println("Welcome to  JavaTpoint")
//    print(20)
//    print("Hello")

    // Kotlin Input: *** ***
    // readLine(): will return string
    println("Enter your name: ")
    val name = readLine()

    // ***
    println("Enter your age: ")
    val age: Int = Integer.valueOf(readLine())

    println("Your name is $name and your age is $age")


    val read = Scanner(System.`in`) //***

    println("Enter your age: ")
    var age = read.nextInt() //***
    println("Your age is: $age")
}
