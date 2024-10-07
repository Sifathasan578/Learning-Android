fun main() {
    try {
        val a = IntArray(5)
        a[5] = 10 / 0
    }
    catch (e: ArithmeticException) {
        println("arithmetic exception catch")
    }
    catch (e: ArrayIndexOutOfBoundsException) {
        println("array index out of bounds exception")
    }
    catch (e: Exception) {
        println("parent exception class")
    }
    println("code after try catch...")

    // must be: most specific to general! not the other way around, otherwise it will give warning

    /*catch (e: Exception) {
        println("parent exception catch")
    }
    catch (e: ArithmeticException) {
        println("arithmetic exception catch")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("array index outofbounds exception")
    }*/
}
