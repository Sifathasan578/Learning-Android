
class Person {
    var name: String? = null
    var age: Int? = null
}

fun main() {
    */
/*#also:
      used when we want to perform some additional operations on a object after we have initialized it
      Property 1: Refer to the person object by using 'it'
      Property 2: The return value is the 'context object'*/


    val numberList: MutableList<Int> = mutableListOf(1, 2, 3)

    val duplicates = numberList.also {
//        println("List: $numberList")
        println("List: $it")
        numberList.add(4)
        println("Updated List: $it")
        numberList.remove(2)
        println("Updated List: $it")

//        returns object
    }

    // same
    println(numberList)
    println(duplicates)
}
