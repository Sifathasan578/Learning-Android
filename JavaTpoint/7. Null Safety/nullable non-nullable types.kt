fun main() {
    // nullable: hold null
    // non nullable: can not hold null

//    var str: String = null // string can not hold null, compile error

    // making it nullable
    var strr: String? = null
    println(strr)

    // we can not assign null to a non nullable variable
    var str2: String = "sifat"
//    str2 = null // error
    var str3: String? = null
    str3 = "sifat"
    println(str3)

    // can assign null to a nullable
    str3 = null
    println(str3)


//    Checking for null in conditions
    var s: String? = "Hello"
    var len = if(s != null) s.length else -1

    println(s)
    println(len)

    s = null
    len = if(s != null) s.length else -1

    println(s)
    println(len)
}

