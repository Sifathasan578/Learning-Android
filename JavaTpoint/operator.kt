fun main() {
    //Arithmetic Operator
//    var a=10;
//    var b=5;
//    println(a+b);
//    println(a-b);
//    println(a*b);
//    println(a/b);
//    println(a%b);

    //Relation Operator
    var a = 5
    var b = 10

    val max = if(a > b) {
        println("a > b")
        a
    }
    else {
        println("a < b")
        b
    }
    println(max)

    // *** ***
    // In Kotlin, if is an expression, meaning it returns a value, and that value can be assigned to a variable. This is why you can write something like:
    val maxx = if (a > b) a else b

    //Assignment operator
    a = 20;
    b = 5
    a+=b
    println("a+=b :"+ a)
    a-=b
    println("a-=b :"+ a)
    a*=b
    println("a*=b :"+ a)
    a/=b
    println("a/=b :"+ a)
    a%=b
    println("a%=b :"+ a)

    //Unary Operator
    a = 10
    b = 5
    var flag = true
    println("+a :" + +a)
    println("-b :" + -b)
    println("++a :" + ++a)
    println("--b :" + --b)
    println("!flag :" + !flag)


    //Logical Operator
    a = 10
    b = 5
    var c = 15
    flag = false
    var result: Boolean
    result = (a>b) && (a>c)
    println("(a>b) && (a>c) :"+ result)
    result = (a>b) || (a>c)
    println("(a>b) || (a>c) :"+ result)
    result = !flag
    println("!flag :"+ result)

//    Bitwise Operation
    a = 10
    b = 2

    println("a.shl(b): "+a.shl(b))
    println("a.shr(b): "+a.shr(b))
    println("a.ushr(b:) "+a.ushr(b))
    println("a.and(b): "+a.and(b))
    println("a.or(b): "+a.or(b))
    println("a.xor(b): "+a.xor(b))
    println("a.inv(): "+a.inv())
}
