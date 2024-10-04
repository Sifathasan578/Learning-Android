fun main() { // main function will appear in every kotlin code, executes code
    // Use var or val for storing purposes!
    // syntax: var variableName = value

    var name = "Sifat"
    println(name)

    val number = 5.7 // val can not be reassigned
    println(number)

    name = "Hasan"
    println(name)

    // Different way
    var empName: String
    empName = "Imrul"

    println(empName)

    // The val keyword is useful when you want a variable to always store the same value, like PI (3.14159...)

    var doubleNum: Double
    doubleNum = 5.98
    println(doubleNum)

    var intNum: Int
    intNum = 5
    println(intNum)

    var strName: String
    strName = "Hello"
    println(strName)

    var longNum: Long
    longNum = 1111111111111111111L
    println(longNum)

    val pi = 3.14159265
    println(pi)

    var myName = "Sifat"
    println("Hello, my name is " + myName)

    var lastName = " Hasan"
    myName += lastName
    println("My full name is " + myName + "!")

    val a = 5
    val b = 6

    println(a + b) 
}

