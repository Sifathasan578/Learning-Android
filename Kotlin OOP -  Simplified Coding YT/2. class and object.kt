fun main() {
    val oBox1: Box = Box()
    val oBox2: Box = Box()
    val oBox3: Box = Box()

    /* Kotlin has inbuilt getter while accessing. so, even might seem like we are accessing directly but we are not */

    println("Length: ${oBox1.length}")
    println("Width: ${oBox1.width}")
    println("Height: ${oBox1.height}")

    println(oBox1.fillContents()) // returns unit
    println(oBox1.boxOpen()) // returns unit

    // here also the setter is executed silently
    oBox2.length = 15
    println(oBox2.length)
}

// properties: variable
// behavior: function

class Box {
    var length: Int = 10
    var width: Int = 20
    var height: Int = 5

    fun fillContents(): Unit {
        println("Box is filled!")
    }

    fun boxOpen(): Unit {
        println("Box is open")
    }
}
