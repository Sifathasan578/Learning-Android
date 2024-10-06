
fun main() {
    var n: Int = Integer.valueOf(readLine())
    tillN(n)
    nToOne(n)
    println(factorial(n))
    println(sumToN(n))


}

fun tillN(n: Int) {
    if(n==0) return
    tillN(n-1)
    println(n)
}

fun nToOne(n: Int) {
    if(n==0) return
    println(n)
    nToOne(n-1)
}

fun factorial(n: Int): Int {
    if(n == 1) return 1
    return n * factorial(n - 1)
}

fun sumToN(n: Int): Int {
    if(n == 1) return 1
    return n + sumToN(n - 1)
}

// Tail Recursion: ?? Confusion
tailrec fun sumToN(n: Int, acc: Int = 0): Int {
    if (n == 0) return acc
    return sumToN(n - 1, acc + n)  // Tail-recursive call, no operations after this
}

// #Default and Named Argument
//fun main() {
//    run()
//}
//
//// Default parameter
//fun run(num:Int= 5, latter: Char ='x'){
//    print("parameter in function definition $num and $latter")
//}

//fun main(args: Array<String>) {
//    run(3)
//}
//fun run(num:Int= 5, latter: Char ='x'){
//    print("parameter in function definition $num and $latter")
//}

//fun main(args: Array<String>) {
//    run(3,'a')
//}
//fun run(num:Int= 5, latter: Char ='x'){
//    print("parameter in function definition $num and $latter")
//}

fun main(args: Array<String>) {
    run(latter='a') // Named parameter
}
fun run(num:Int= 5, latter: Char ='x'){
    print("parameter in function definition $num and $latter")
}
