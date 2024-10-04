class Car(var brand: String, var model: String, var year: Int) {
    // function inside a class/ method
    fun drive() {
        println("Wroom!")
    }

    fun speed(maxSpeed: Int) {
        println("Max speed is: $maxSpeed")
    }
}

fun main() {
    val c1 = Car("Ford", "Mustang", 1969)
    println(c1.model)
    c1.drive()
    c1.speed(200)
}
