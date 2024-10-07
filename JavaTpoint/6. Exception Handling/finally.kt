// finally: always executes whether exception is handled or not.

fun main() {
    try {
//        val data = 10 / 0
        val data = 10 / 0
        println(data)
    }
//    catch (e: NullPointerException) {
    catch (e: ArithmeticException) {
        println(e)
    }
    finally {
        // give error but still finally block will execute
        println("finally block always executes")
    }
    println("below codes...")
}
