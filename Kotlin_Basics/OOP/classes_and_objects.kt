class Car { // Class name: Uppercase, good practice
    // properties: a variable that belongs to the class.
    var brand = "Default Brand"
    var model = "Default Model"
    var year = 0
}

fun main() {
    val c1 = Car()
    println(c1.brand)
    println(c1.model)
    println(c1.year)

    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    // Multiple Objects:
    val c2 = Car()
    c2.brand = "Ford"
    c2.model = "Mustang"
    c2.year = 1969

    val c3 = Car()
    c3.brand = "BMW"
    c3.model = "X5"
    c3.year = 1999

    println(c2.brand)  // Ford
    println(c3.brand)  // BMW
}
