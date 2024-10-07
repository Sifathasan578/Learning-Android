// Syntax of nested try block

/*
try {
    // code block
    try {
        // code block
    }
    catch(e: SomeException) {
    }
}
catch(e: SomeException) {
}
*/

fun main() {
    val arrInt =  intArrayOf(11, 22, 33, 14, 15, 16, 20)
    val arrInt2 = intArrayOf(2, 0, 3, 0, 5, 0)

    try {
        for(i in arrInt.indices) {
            try {
                println("${arrInt[i]} / ${arrInt2[i]} is ${arrInt[i] / arrInt2[i]}")
            }
            catch (e: ArithmeticException) {
                println("Can not divide by zero")
            }

        }
    }
    catch (e: ArrayIndexOutOfBoundsException) {
        println("Element not found")
    }
}
