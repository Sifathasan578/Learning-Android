/*Smart cast is a feature in which Kotlin compiler tracks conditions inside if expression. If compiler founds a variable is not null of type nullable then the compiler will allow to access the variable.*/
/*not null of type nullable*/

fun main() {
    /*not null of type nullable*/
    var str: String? = "sifat"
    // println(str.length) // error

    /*When we try to access a nullable type of String without safe cast it will generate a compile error.*/

    /*Solution #1: Safe Call/ Elvis Operator "?.": This will only access length if str is not null. If null it will return null without throwing an exception*/
    println(str?.length)

    /*Solution #2: Non-null assertion: !! (ensuring there will not be any null)*/
    println(str!!.length)

    /*Solution #3: Smart cast: Check via condition*/
    if(str != null) {
        println(str.length)
    }
    else {
        println("Error")
    }
    // If in a place !! is used the rest of the code doesn't need any farther check!

//    Use of is for smart cast
    val obj: Any = "hasan"
    if(obj is String) {
        println(obj.length)
    }
    else if(obj is Int) {
        println(obj)
    }

    if(obj !is Int) {
        println("'$obj' is not an Int")
    }
}
