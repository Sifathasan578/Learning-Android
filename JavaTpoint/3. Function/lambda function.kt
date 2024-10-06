//{ variable -> body_of_function}

fun main() {
    val sum: (Int, Int) -> Int = {a, b -> a + b} // Lambda Function
    println(sum(5, 6))
}

//fun sum(a: Int, b: Int) {
//    val add: Int = a + b
//    println(add)
//}

/// Confusion: Will need to Come back
fun myFun(org: String,portal: String, fn: (String,String) -> String): Unit {
    val result = fn(org,portal)
    println(result)
}

fun main(args: Array<String>){
    val fn:(String,String)->String={org,portal->"$org develop $portal"}
    myFun("sssit.org","javatpoint.com",fn)
}
