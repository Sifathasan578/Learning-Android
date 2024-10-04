// Data Types
fun main() {
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    // Specifying the data type
    val myNum2: Int = 5                // Int
    val myDoubleNum2: Double = 5.99    // Double
    val myLetter2: Char = 'D'          // Char
    val myBoolean2: Boolean = true     // Boolean
    val myText2: String = "Hello"      // String

    // Byte: -128 to 127: -2^7 to 2^7-1
    // Short: -32768 to 32767: -2^15 to 2^15-1
    // Int: -2147483648 to 2147483647: -2^31 to 2^31-1
    // Long: -9223372036854775808 to 9223372036854775807: -2^63 to 2^63-1

    val myNumber1 = 2147483647  // Int
    val myNumber2 = 2147483648  // Long

    val myFloat: Float = 5.75F
    println(myFloat)

    val myLong: Long = 15000000000L
    println(myLong)

    val myDouble: Double = 19.99
    println(myDouble)

    // Float: 6/7 digits after decimal
    // Double: 15 digits after decimal

    // Scientific Number
    // Using e or E as power of 10

    val mySciFloat: Float = 5e2F // 5 X (10 ^ 2)
    println(mySciFloat)

    val isKotlinFun: Boolean = true
    if(isKotlinFun) {
        println("Yes Kotlin is Fun!")
    }
    else {
        println("No Kotlin is not Fun!")
    }

    // To convert a numeric data type to another type
    // toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():

    val x: Int = 5
    val y: Long = x.toLong()
    println(y)
}
