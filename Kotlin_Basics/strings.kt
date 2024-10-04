fun main() {
    var myName: String = "Sifat"
    var myName2 = "Sifat"
    var myName3: String
    myName3 = "Imrul"

    println(myName3)

    var strAccess = "Hello, there"
    println(strAccess[0])
    println(strAccess[1])

    var txt = "text here"
    println("Length of '" + txt + "' is " + txt.length)

    // uppercase() and lowercase():
    // Converts into uppercase and vice versa
    var str = "hello"
    var str2 = "HELLO"
    println(str.uppercase())
    println(str2.lowercase())

    str = "sif"
    str2 = "sif"
    // compareTo(string)
    println(str.compareTo(str2)) // 0 if equal

    // indexOf(): to locate a string in a string, will return index
    txt = "Hi, there Sifat. What are you doing?"
    println(txt.indexOf("there"))

    txt = "hi remember this word 'hello'"
    println(txt)

    // Concatenation
    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)

    // plus(): concatenates
    firstName = "hello"
    lastName = " Sif"
    println(firstName.plus(lastName))

    // String Templates/ Interpolation
    firstName = "Imrul Hasan"
    lastName = "Sifat"
    println("My full name is $firstName $lastName")
}
