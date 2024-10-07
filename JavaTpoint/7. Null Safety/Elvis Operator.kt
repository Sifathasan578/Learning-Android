fun main() {
    // Elvis Operator: ?.
    // if value is non-null returns it, otherwise returns value after it

    /*val name: String? = null
    val result = name ?: "no name mentioned"
    println(result)*/

    val n: Int? = null
    val res: Int = n ?: -1 // return -1
    println(res)
}

// Confusion!!!
fun main() {
    val fruitName: String = fruits()
    println(fruitName)
}

fun fruits(): String {
    val str: String? = "abc"
    val strLen: Int = str?.length ?: -1
    var output = "str = $str\nLen: $strLen\n"

    // Inner function:
    fun check(txtOne: String?, txtTwo: String?): String? {
        val txtOne = txtOne ?: return null
        val txtTwo = txtTwo ?: IllegalArgumentException("text exception")

        return "\ntextOne = $txtOne\n"+
                "textTwo = $txtTwo\n"
    }

    output += "check(null,\"mango\") = ${check(null,"mango")}\n" +
            "check(\"apple\",\"orange\") = ${check("apple","orange")}\n"
    return output
}
