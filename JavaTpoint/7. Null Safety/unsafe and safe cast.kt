fun main(args: Array<String>) {
    /*val obj: Any? = null
    val str: String = obj as String // This line will throw a NullPointerException
    println(str)

    val obj: Any = "Hello"
    val str: Int = obj as Int // This line will throw a ClassCastException*/

    /*val obj: Any? = null
    val str: String = obj as String
    println(str)*/

    // value has to be nullable for casting to work
    /*val obj2: Any = 123
    val str2: String = obj2 as String // error
    println(str2)*/

    // unsafe cast: as
    /*val obj: Any = 123 // non-nullable
    val str = obj as String // give an error
    println(str)*/

    // safe cast: as?
    val obj2: Any = 123
    val str2 = obj2 as? String // will return null if type are not compatible
    println(str2)

    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)
}

/*
fun main(args: Array<String>) {

}
vs
fun main() {

}*/
