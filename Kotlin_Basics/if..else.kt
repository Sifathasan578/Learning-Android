fun main() {
    // Use 'when' to specify many alternative blocks of code to be executed
    if (20 > 18) {
        println("20 is greater than 18")
    }
    val x = 20
    val y = 18
    if (x > y) {
        println("x is greater than y")
    }

    val time = 20
    if (time < 18) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
    // Outputs "Good evening."

    val timee = 22
    if (timee < 10) {
        println("Good morning.")
    } else if (timee < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
    // Outputs "Good evening."

    //*** Kotlin: If..Else Expressions
    val num = 20
//    val number = if(num < 10) {
//        "Number less than 10!"
//    }
//    else {
//        "Number greater or equal to 10!"
//    }
//    println(number)

    // or
    val number = if(num < 10) "Less than 10" else ">= 10"
    println(number)
}
